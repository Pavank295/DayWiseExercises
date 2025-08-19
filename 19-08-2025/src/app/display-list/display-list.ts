import { Component, Input } from '@angular/core';
import { IFruit } from '../ifruit';
@Component({
  selector: 'app-displaylist',
  standalone: true,
  templateUrl: './display-list.html',
  styleUrls: ['./display-list.css']
})
export class DisplayListComponent {
  @Input() fruits: IFruit[] = [];

  removeFruit(fruitId: number) {
    this.fruits = this.fruits.filter(fruit => fruit.id !== fruitId);
  }
}

