import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FoodService } from '../../services/food'; 
import { FoodItem } from '../../food-item';         

@Component({
  selector: 'app-food-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './food-list.html',
  styleUrls: ['./food-list.css']
})
export class FoodListComponent {
  foods: FoodItem[] = [];

  constructor(private foodService: FoodService) {
    this.foods = this.foodService.getFoods();
  }
}
