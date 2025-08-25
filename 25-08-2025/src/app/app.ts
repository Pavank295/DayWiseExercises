import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';   
import { MatListModule } from '@angular/material/list'; 

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.html',
  styleUrls: ['./app.css'],
  imports: [CommonModule, MatListModule]  
})
export class AppComponent {
  title = 'City List';

  cities: string[] = [
    'Hyderabad',
    'Bengaluru',
    'Chennai',
    'Mumbai',
    'Delhi',
    'Kolkata'
  ];
}

