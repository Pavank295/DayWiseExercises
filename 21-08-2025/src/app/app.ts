import { Component } from '@angular/core';
import { Movie } from './movie';
import { MovieComponent } from './movie/movie';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [MovieComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {}
