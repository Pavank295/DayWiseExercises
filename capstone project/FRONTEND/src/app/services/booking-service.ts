import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { IBooking } from '../ibooking';
import { IPayment } from '../ipayment';
import { Con1 } from '../services/util/util';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

private baseUrl = `${Con1.apiUrl}/bookings`;

  constructor(private http: HttpClient) {}

  createBooking(booking: IBooking): Observable<IBooking> {
  return this.http.post<IBooking>(`${this.baseUrl}`, booking);
}

  pay(payment: IPayment): Observable<IPayment> {
    return this.http.post<IPayment>(`${this.baseUrl}/pay`, payment);
  }

  downloadTicket(pnr: string): Observable<Blob> {
  return this.http.get(`${this.baseUrl}/${pnr}/pdf`, { responseType: 'blob' });
}
  getBooking(bookingId: number | string): Observable<IBooking> {
  return this.http.get<IBooking>(`${this.baseUrl}/${bookingId}`);
}
}