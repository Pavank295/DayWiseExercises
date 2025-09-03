import { Injectable, inject } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../services/environments/environment';

export interface Flight {
  id?: number;
  airline: string;
  flightNumber: string;
  sourceCode: string;
  destCode: string;
  travelDate: string;   
  departTime: string;  
  arriveTime: string;   
  durationMinutes: number;
  price: number;
}

@Injectable({ providedIn: 'root' })
export class FlightService {
  private http = inject(HttpClient);
  private base = environment.apiBaseUrl;

  search(from: string, to: string, date: string): Observable<Flight[]> {
    const params = new HttpParams().set('from', from).set('to', to).set('date', date);
    return this.http.get<Flight[]>(`${this.base}/api/search`, { params });
  }
}