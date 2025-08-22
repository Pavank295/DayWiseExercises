import { Component, OnInit } from '@angular/core';
import { NgFor } from '@angular/common'; 
import { DatePipe } from '@angular/common'; 
import { OrderService, OrderHistory } from '../order';

@Component({
  selector: 'app-order-history',
  standalone: true,    
  imports: [NgFor, DatePipe],  
  templateUrl: './order-history.html'
})
export class OrderHistoryComponent implements OnInit {
  orders: OrderHistory[] = [];

  constructor(private orderService: OrderService) {}

  ngOnInit(): void {
    this.orderService.getOrderHistory().subscribe(data => this.orders = data);
  }
}
