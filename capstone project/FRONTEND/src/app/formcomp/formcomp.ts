import { ChangeDetectorRef, Component } from '@angular/core';
import { Router } from '@angular/router';
import { IBooking } from '../ibooking';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { BookingService } from '../services/booking-service';
import { IFlight } from '../iflight';

@Component({
  selector: 'app-formcomp',
  imports: [FormsModule,CommonModule],
  templateUrl: './formcomp.html',
  styleUrl: './formcomp.css'
})
export class Formcomp {
  flight!: IFlight;
  booking: IBooking = {
    passengerName: '',
    passengerAge: 0,
    gender: '',
    email: '',
    phone: '',
    flightId: 0,
    pnr: '',
    numberOfTicket: 1
  };

  constructor(private router: Router, private bookingService: BookingService,private cdr: ChangeDetectorRef) {
    const nav = this.router.getCurrentNavigation();
    const state = nav?.extras.state as { flight: IFlight };
    this.flight = state.flight;
  }

  ngOnInit(): void {
    if (this.flight) {
      this.booking.flightId = this.flight.id;
      this.booking.totalPrice = this.flight.price;
    }
  }


  onSubmit() {
    this.booking.totalPrice = this.flight.price;
    this.bookingService.createBooking(this.booking).subscribe({
      next: (created) => {
        console.log("Booking created:", created);
        this.router.navigate(['/summary'], { state: { booking: created,flight: this.flight  } });
      },
      error: (err) => {
        console.error("Error creating booking:", err);
      }
    });
  }
}