import { Injectable } from '@angular/core';
import { FoodItem } from '../food-item';

@Injectable({
  providedIn: 'root'
})
export class FoodService {

  private foods: FoodItem[] = [
    { id: 1, name: 'Pizza', price: 299 },
    { id: 2, name: 'Burger', price: 149 },
    { id: 3, name: 'Pasta', price: 199 }
  ];

  getFoods(): FoodItem[] {
    return this.foods;
  }
}
