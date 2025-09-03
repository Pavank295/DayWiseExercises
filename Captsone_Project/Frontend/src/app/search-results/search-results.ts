import { Component, OnDestroy, OnInit, inject } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgFor, NgIf, CurrencyPipe } from '@angular/common';
import { FlightService, Flight } from '../services/flight';
import { Subscription } from 'rxjs';

@Component({
  standalone: true,
  selector: 'app-search-results',
  imports: [NgFor, NgIf,  CurrencyPipe, ],
  templateUrl: './search-results.html',
  styleUrls: ['./search-results.css']
})
export class SearchResultsComponent implements OnInit, OnDestroy {
  private route = inject(ActivatedRoute);
  private router = inject(Router);
  private flightSvc = inject(FlightService);

  from = '';
  to = '';
  date = '';
  loading = false;
  flights: Flight[] = [];
  sub?: Subscription;

  ngOnInit(): void {
    this.from = (this.route.snapshot.queryParamMap.get('from') || '').toUpperCase();
    this.to = (this.route.snapshot.queryParamMap.get('to') || '').toUpperCase();
    this.date = this.route.snapshot.queryParamMap.get('date') || '';
    this.fetch();
  }

  fetch() {
    this.loading = true;
    this.sub = this.flightSvc.search(this.from, this.to, this.date).subscribe({
      next: (res) => { this.flights = res || []; this.loading = false; },
      error: () => { this.flights = []; this.loading = false; }
    });
  }

  book(f: Flight) {
    const flightId = f.id ?? 1; 
    this.router.navigate(['/book', flightId], { queryParams: { price: f.price, from: this.from, to: this.to, date: this.date, flightNumber: f.flightNumber } });
  }

  ngOnDestroy(): void {
    this.sub?.unsubscribe();
  }
}

