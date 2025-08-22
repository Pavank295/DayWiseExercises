import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ProductService } from '../services/product';
import { OrderService } from '../order';
import { Product } from '../product';

@Component({
  selector: 'app-purchase',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './purchase.html',
  styleUrls: ['./purchase.css']
})
export class PurchaseComponent {
  products: Product[] = [];
  selectedProductId!: number;
  purchaseQty!: number;

  errorMessage = '';
  successMessage = '';

  constructor(
    private productService: ProductService,
    private orderService: OrderService
  ) {
    this.productService.list().subscribe(data => this.products = data);
  }

  placeOrder() {
    if (!this.selectedProductId || !this.purchaseQty) {
      this.errorMessage = 'Please select product and quantity';
      return;
    }
    this.errorMessage = '';
    this.successMessage = 'Order placed successfully!';

    this.orderService.create({
      productId: this.selectedProductId,
      quantity: this.purchaseQty
    }).subscribe(() => {
      this.successMessage = 'Order placed successfully!';
    });
  }
}
