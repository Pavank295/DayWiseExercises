import { Component, OnDestroy, OnInit, inject } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookingService, Booking } from '../services/booking';
import { NgIf } from '@angular/common';
import { Subscription } from 'rxjs';

@Component({
  standalone: true,
  selector: 'app-payment',
  imports: [NgIf],
  templateUrl: './payment.html',
  styleUrls: ['./payment.css']
})
export class PaymentComponent implements OnInit, OnDestroy {
  private route = inject(ActivatedRoute);
  private router = inject(Router);
  private bookingSvc = inject(BookingService);

  bookingId!: number;
  current?: Booking;
  sub?: Subscription;

  ngOnInit(): void {
    this.bookingId = Number(this.route.snapshot.paramMap.get('bookingId'));
    this.sub = this.bookingSvc.poll(this.bookingId, 2000).subscribe(b => {
      this.current = b;
      if (b.status === 'SUCCESSFUL') {
        this.router.navigate(['/success', this.bookingId]);
      } else if (b.status === 'FAILED') {
        this.router.navigate(['/failure', this.bookingId]);
      }
    });
  }

  ngOnDestroy(): void {
    this.sub?.unsubscribe();
  }
}
