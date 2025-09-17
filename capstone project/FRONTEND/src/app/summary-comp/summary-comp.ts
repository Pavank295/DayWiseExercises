import { Component } from '@angular/core';
import { IBooking } from '../ibooking';
import { Router } from '@angular/router';
import { IFlight } from '../iflight';

@Component({
  selector: 'app-summary-comp',
  imports: [],
  templateUrl: './summary-comp.html',
  styleUrl: './summary-comp.css'
})
export class SummaryComp {
   booking!: IBooking;
   flight!: IFlight;

  constructor(private router: Router) {
    const nav = this.router.getCurrentNavigation();
    const state = nav?.extras.state as { booking: IBooking, flight: IFlight  };
    if (state) {
    this.booking = state.booking;
    this.flight = state.flight;
  }
  }

  proceedToPay() {
    this.router.navigate(['/payment', this.booking.id], { state: { booking: this.booking } });
  }
}