import { Routes } from '@angular/router';
import { HomeComponent } from './home/home';
import { SearchResultsComponent } from './search-results/search-results';
import { BookingComponent } from './booking/booking';
import { PaymentComponent } from './payment/payment';
import { SuccessComponent } from './success/success';
import { FailureComponent } from './failure/failure';

export const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'results', component: SearchResultsComponent },
  { path: 'book/:flightId', component: BookingComponent },
  { path: 'payment/:bookingId', component: PaymentComponent },
  { path: 'success/:bookingId', component: SuccessComponent },
  { path: 'failure/:bookingId', component: FailureComponent },
  { path: '**', redirectTo: '' },
];
