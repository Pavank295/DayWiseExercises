import { Component, OnInit, inject } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { BookingService, CreateBookingRequest } from '../services/booking';
import { CurrencyPipe, NgIf } from '@angular/common';

@Component({
  standalone: true,
  selector: 'app-booking',
  imports: [FormsModule, CurrencyPipe, NgIf],
  templateUrl: './booking.html',
  styleUrls: ['./booking.css']
})
export class BookingComponent implements OnInit {
  private route = inject(ActivatedRoute);
  private router = inject(Router);
  private bookingSvc = inject(BookingService);

  flightId!: number;
  amount!: number;
  passengerName = '';
  passengerEmail = '';
  method: 'CARD' | 'UPI' | 'NETBANKING' | 'WALLET' = 'CARD';

  flightNumber = '';
  from = ''; to = ''; date = '';

  submitting = false;
  error?: string;

  ngOnInit(): void {
    this.flightId = Number(this.route.snapshot.paramMap.get('flightId'));
    this.amount = Number(this.route.snapshot.queryParamMap.get('price') || 0);
    this.flightNumber = this.route.snapshot.queryParamMap.get('flightNumber') || '';
    this.from = this.route.snapshot.queryParamMap.get('from') || '';
    this.to = this.route.snapshot.queryParamMap.get('to') || '';
    this.date = this.route.snapshot.queryParamMap.get('date') || '';
  }

  submit() {
    this.error = undefined;
    if (!this.passengerName || !this.passengerEmail) {
      this.error = 'Please enter passenger name and email';
      return;
    }
    const req: CreateBookingRequest = {
      flightId: this.flightId,
      amount: this.amount,
      passengerName: this.passengerName,
      passengerEmail: this.passengerEmail,
      method: this.method
    };
    this.submitting = true;
    this.bookingSvc.create(req).subscribe({
      next: (b) => {
        this.submitting = false;
        this.router.navigate(['/payment', b.id]);
      },
      error: (e) => {
        this.submitting = false;
        this.error = 'Booking failed. Please try again.';
        console.error(e);
      }
    });
  }
}
