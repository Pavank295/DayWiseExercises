import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CelsiusToFahrenheitPipe } from '../c-to-f-pipe'; 


@Component({
  selector: 'app-ex3',
  standalone: true,
  imports: [FormsModule, CelsiusToFahrenheitPipe],
  templateUrl: './ex3.html',
  styleUrl: './ex3.css'
})
export class Ex3 {
  tempC = signal<number | null>(null);
}
