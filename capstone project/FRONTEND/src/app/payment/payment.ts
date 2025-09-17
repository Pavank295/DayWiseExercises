import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { PaymentService } from '../services/payment-service';
import { BookingService } from '../services/booking-service';
import { ActivatedRoute, Router } from '@angular/router';
import { IBooking } from '../ibooking';
import { IPayment } from '../ipayment';
import { CurrencyPipe } from '@angular/common';
import { IFlight } from '../iflight';

@Component({
  selector: 'app-payment',
  imports: [FormsModule, CurrencyPipe],
  templateUrl: './payment.html',
  styleUrl: './payment.css'
})
export class Payment implements OnInit{
  booking!: IBooking;
  payment: IPayment = {
    bookingId: 0,
    amount: 0,
    modeOfPayment: '',
    accountNumber: '',
    cvv: 0
  };

  constructor(
    private router: Router,
    private activatedRoute: ActivatedRoute,
    private bookingService: BookingService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit() {
    this.activatedRoute.params.subscribe(params => {
      const bookingId = params['id'];
      if (bookingId) {
        this.bookingService.getBooking(bookingId).subscribe(b => {
          this.booking = b;
          this.payment.amount = b.totalPrice!; // safer than flight.price
          this.payment.bookingId = b.id!;
          console.log("Booking fetched:", this.booking);
          console.log("Payment prepared:", this.payment);
        });
      } else {
        console.error("No bookingId in route!");
        this.router.navigate(['/']); // fallback
      }
    });
  }

  pay() {
    const payment: IPayment = {
      bookingId: this.payment.bookingId,
      amount: this.payment.amount,
      modeOfPayment: this.payment.modeOfPayment,
      accountNumber: this.payment.accountNumber,
      cvv: this.payment.cvv
    };

    this.bookingService.pay(payment).subscribe((data) => {
      console.log('Payment Response:', data);
      this.router.navigate(['/success']);

      this.bookingService.downloadTicket(this.booking.pnr!).subscribe((pdf: Blob) => {
    const url = window.URL.createObjectURL(pdf);
    const a = document.createElement('a');
    a.href = url;
    a.download = `ticket_${this.booking.pnr}.pdf`;
    a.click();
      });
    });
  }
}