import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RouterLink],
  template: `
    <div class="text-center">
      <h1 class="mb-3">Welcome to Products CRUD</h1>
      <p class="mb-4">Manage products: create, read, update, and delete.</p>
      <a routerLink="/products" class="btn btn-primary">Go to Products</a>
    </div>
  `
})
export class HomeComponent {}
