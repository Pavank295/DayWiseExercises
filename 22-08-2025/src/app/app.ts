import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',   
  standalone: true,
  imports: [RouterLink, RouterOutlet],
  template: `
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark px-3">
      <a class="navbar-brand" routerLink="/">ProductsApp</a>
      <div class="collapse navbar-collapse">
        <ul class="navbar-nav ms-2">
          <li class="nav-item"><a class="nav-link" routerLink="/products">Products</a></li>
          <li class="nav-item"><a class="nav-link" routerLink="/products/new">Add Product</a></li>
        </ul>
      </div>
    </nav>
    <div class="container py-4">
      <router-outlet></router-outlet>
    </div>
  `
})
export class AppComponent {}

