import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IFruit } from '..//ifruit';   

@Component({
  selector: 'app-fruit',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './fruit.html',
  styleUrls: ['./fruit.css']
})
export class FruitComponent {
  @Input() fruit!: IFruit;  
}
