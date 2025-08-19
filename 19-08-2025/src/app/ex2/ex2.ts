import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex2',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './ex2.html',
  styleUrls: ['./ex2.css']
})
export class Ex2Component {
  applyRed = true;
  applyBig = false;

  toggleStyles() {
    this.applyRed = !this.applyRed;
    this.applyBig = !this.applyBig;
  }
}
