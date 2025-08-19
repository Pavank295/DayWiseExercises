import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex3',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './ex3.html',
  styleUrls: ['./ex3.css']
})
export class Ex3Component {
  isRed = true;
  isBig = false;

  getNgClass() {
    return {
      'red-text': this.isRed,
      'big-text': this.isBig
    };
  }

  toggle() {
    this.isRed = !this.isRed;
    this.isBig = !this.isBig;
  }
}
