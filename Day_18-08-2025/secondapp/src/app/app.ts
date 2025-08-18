import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('secondapp');
  name: string = 'Angular';
  greet() {
     console.log(`Hello ${this.name}`);
  }
}
