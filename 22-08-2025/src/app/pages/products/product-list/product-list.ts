import { Component, OnInit, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { ProductService } from '../../../services/product';
import { Product } from '../../../product';

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './product-list.html'
})
export class ProductListComponent implements OnInit {
  private productSvc = inject(ProductService);
  products: Product[] = [];
  loading = false;
  error = '';

  ngOnInit(): void {
    this.fetch();
  }

  fetch(): void {
    this.loading = true;
    this.error = '';
    this.productSvc.list().subscribe({
      next: (data: Product[]) => { this.products = data; this.loading = false; },
      error: () => { this.error = 'Failed to load products'; this.loading = false; }
    });
  }

  onDelete(id: number | undefined): void {
    if (!id) return;
    if (!confirm('Delete this product?')) return;
    this.productSvc.delete(id).subscribe({
      next: () => this.fetch(),
      error: () => alert('Delete failed')
    });
  }
}
