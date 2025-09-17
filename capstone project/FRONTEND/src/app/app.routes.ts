import { Routes } from '@angular/router';
import { Home } from '../app/home/home';
import { Booking } from '../app/booking/booking';
import { Payment } from '../app/payment/payment';
import { Formcomp } from '../app/formcomp/formcomp';
import { SummaryComp } from '../app/summary-comp/summary-comp';
import { SuccessComp } from '../app/success-comp/success-comp';

export const routes: Routes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' }, 
  { path: 'home', component: Home },
  { path: 'flights', component: Booking },
  { path: 'payment/:id', component: Payment },
  { path: 'passenger', component: Formcomp },
  { path: 'summary', component: SummaryComp },
  { path: 'success', component: SuccessComp }
];
