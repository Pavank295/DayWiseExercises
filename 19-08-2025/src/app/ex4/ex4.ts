import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex4',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './ex4.html',
  styleUrls: ['./ex4.css']
})
export class Ex4Component {
  isHighlighted = true;
  fontSize = 18;

  getStyles() {
    return {
      'color': this.isHighlighted ? 'blue' : 'gray',
      'font-size.px': this.fontSize,
      'background-color': this.isHighlighted ? 'lightyellow' : 'white',
      'padding': '10px',
      'border-radius': '8px'
    };
  }

  toggleHighlight() {
    this.isHighlighted = !this.isHighlighted;
    this.fontSize = this.isHighlighted ? 22 : 18;
  }
}
