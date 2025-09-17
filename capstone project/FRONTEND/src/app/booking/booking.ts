import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { IFlight } from '../iflight';
import { ActivatedRoute, Router } from '@angular/router';
import { FlightService } from '../services/flight-service';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-booking',
  imports: [CommonModule,MatCardModule,MatButtonModule,MatCheckboxModule,FormsModule],
  templateUrl: './booking.html',
  styleUrl: './booking.css'
})
export class Booking implements OnInit {
  flights: IFlight[] = [];
  filteredFlights: IFlight[] = [];
  searched = false;
  src!: string;
  dst!: string;
  date!: string;

  airlines: string[] = [];
  airlineFilters: { [key: string]: boolean } = {};
  timeFilters = { early: false, late: false };

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private flightService: FlightService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.route.queryParams.subscribe(params => {
      this.src = params['src'];
      this.dst = params['dst'];
      this.date = params['date'];

      if (this.src && this.dst && this.date) {
        this.flightService.searchFlights(this.src, this.dst, this.date).subscribe({
          next: (data) => {
            console.log("Flights received:", data);
            this.flights = data;
            this.filteredFlights = [...this.flights];
            this.searched = true;

            this.airlines = [...new Set(this.flights.map(f => f.airline))];
            this.airlines.forEach(a => (this.airlineFilters[a] = false));

            this.cdr.detectChanges();
          },
          error: (err) => {
            console.error("Error fetching flights:", err);
          }
        });
      }
    });
  }

  applyFilters() {
    this.filteredFlights = this.flights.filter(f => {
      let depHour = parseInt(f.departureTime.split(':')[0], 10);
      let matchTime =
        (!this.timeFilters.early && !this.timeFilters.late) ||
        (this.timeFilters.early && depHour < 12) ||
        (this.timeFilters.late && depHour >= 12);

      let selectedAirlines = Object.keys(this.airlineFilters).filter(
        k => this.airlineFilters[k]
      );
      let matchAirline =
        selectedAirlines.length === 0 || selectedAirlines.includes(f.airline);

      return matchTime && matchAirline;
    });
  }
  getDuration(dep: string, arr: string): string {
  const [dh, dm] = dep.split(':').map(Number);
  const [ah, am] = arr.split(':').map(Number);
  let depMin = dh * 60 + dm;
  let arrMin = ah * 60 + am;
  if (arrMin < depMin) arrMin += 24 * 60;
  let dur = arrMin - depMin;
  let hrs = Math.floor(dur / 60);
  let mins = dur % 60;
  return `${hrs}h ${mins}m`;
}


  onBook(flight: IFlight) {
    this.router.navigate(['/passenger'], { state: { flight } });
  }
}