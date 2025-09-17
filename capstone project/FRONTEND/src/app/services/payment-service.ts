import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IPayment } from '../ipayment';
import { Observable } from 'rxjs';
import { Payment } from '../payment/payment';
import { Con1 } from '../services/util/util';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {
  private baseUrl = `${Con1.apiUrl}/payments`;

  constructor(private http: HttpClient) {}

  pay(payment: Payment): Observable<Payment> {
    return this.http.put<Payment>(this.baseUrl, payment);
  }
}