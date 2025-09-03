import { Injectable, inject } from '@angular/core';
import { BookingService, Booking } from './booking';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class PaymentService {
  private bookingSvc = inject(BookingService);

  
  pollPayment(bookingId: number, everyMs = 2000): Observable<Booking> {
    return this.bookingSvc.poll(bookingId, everyMs);
  }
}
