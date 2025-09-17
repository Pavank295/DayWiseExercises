import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IFlight } from '../iflight';
import { Con1 } from '../services/util/util';

@Injectable({
  providedIn: 'root'
})
export class FlightService {
private baseUrl = `${Con1.apiUrl}/flights`;

  constructor(private http: HttpClient) {}

  searchFlights(src: string, dst: string, date: string): Observable<IFlight[]> {

    console.log("Calling backend:", `${this.baseUrl}/search`, { src, dst, date });
    return this.http.get<IFlight[]>(`${this.baseUrl}/search`, {
      params: { src, dst, date }
    });
  }
}