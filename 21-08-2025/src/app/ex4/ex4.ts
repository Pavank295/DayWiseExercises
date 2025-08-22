import { Component } from '@angular/core';
import { HighlightStrikethruDirective } from '../highlight-strikethru';

@Component({
  selector: 'app-ex4',
  standalone: true,
  imports: [HighlightStrikethruDirective],
  templateUrl: './ex4.html',
  styleUrl: './ex4.css'
})
export class Ex4 {}
