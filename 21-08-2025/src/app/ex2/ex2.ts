import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-ex2',
  standalone: true,
  imports: [FormsModule, DatePipe], 
  templateUrl: './ex2.html',
  styleUrl: './ex2.css'
})
export class Ex2 {
  selectedDate = signal<string>('');
}
