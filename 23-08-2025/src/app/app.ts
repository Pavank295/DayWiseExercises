import { Component } from '@angular/core';
import { FoodListComponent } from './components/food-list/food-list';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FoodListComponent],
  template: `
    <h1>Welcome to BookMyFood</h1>
    <app-food-list></app-food-list>
  `
})
export class AppComponent {}
