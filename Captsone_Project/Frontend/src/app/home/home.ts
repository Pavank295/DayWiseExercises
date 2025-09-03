import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  standalone: true,
  selector: 'app-home',
  imports: [FormsModule],
  templateUrl: './home.html',
  styleUrls: ['./home.css']
})
export class HomeComponent {
  from = 'HYD';
  to = 'BLR';
  date = new Date().toISOString().substring(0,10); 

  constructor(private router: Router) {}

  search() {
    if (!this.from || !this.to || !this.date) return;
    this.router.navigate(['/results'], { queryParams: { from: this.from, to: this.to, date: this.date } });
  }
}
