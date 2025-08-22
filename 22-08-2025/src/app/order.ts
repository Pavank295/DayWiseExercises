export interface Order {
  id: number;
  productId: number;
  quantity: number;
  date: string;
  status: string;
}

export interface OrderHistory {
  orderId: number;
  productName: string;
  quantity: number;
  date: string;
  status: string;
}
