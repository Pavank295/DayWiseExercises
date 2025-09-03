import { Component, OnInit, inject } from '@angular/core';
import { ActivatedRoute, RouterLink } from '@angular/router';
import { BookingService, Booking } from '../services/booking';
import { AsyncPipe, NgIf } from '@angular/common';
import { Observable } from 'rxjs';

@Component({
  standalone: true,
  selector: 'app-success',
  imports: [NgIf, AsyncPipe, RouterLink],
  templateUrl: './success.html',
  styleUrls: ['./success.css']
})
export class SuccessComponent implements OnInit {
  private route = inject(ActivatedRoute);
  private bookingSvc = inject(BookingService);

  booking$!: Observable<Booking>;

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('bookingId'));
    this.booking$ = this.bookingSvc.get(id);
  }
}
