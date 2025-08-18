import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Secondcompcom } from './secondcompcom/secondcompcom';

@Component({
  selector: 'app-root',
  imports: [Secondcompcom],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('firstapp');
}
