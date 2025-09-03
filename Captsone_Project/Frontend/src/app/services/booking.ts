import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, timer } from 'rxjs';
import { switchMap } from 'rxjs/operators';
import { environment } from '../services/environments/environment';

export interface Booking {
  id: number;
  flightId: number;
  passengerName: string;
  passengerEmail: string;
  amount: number;
  status: 'INITIATED' | 'SUCCESSFUL' | 'FAILED';
  transactionId?: string | null;
}

export interface CreateBookingRequest {
  flightId: number;
  amount: number;
  passengerName: string;
  passengerEmail: string;
  method: 'CARD' | 'UPI' | 'NETBANKING' | 'WALLET';
}

@Injectable({ providedIn: 'root' })
export class BookingService {
  private http = inject(HttpClient);
  private base = environment.apiBaseUrl;

  create(req: CreateBookingRequest): Observable<Booking> {
    return this.http.post<Booking>(`${this.base}/api/bookings`, req);
  }

  get(id: number): Observable<Booking> {
    return this.http.get<Booking>(`${this.base}/api/bookings/${id}`);
  }
  poll(id: number, intervalMs = 2000): Observable<Booking> {
    return timer(0, intervalMs).pipe(
      switchMap(() => this.get(id))
    );
  }
}