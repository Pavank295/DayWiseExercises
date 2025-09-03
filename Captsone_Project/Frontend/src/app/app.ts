export interface FlightSearchCriteria {
  from: string;
  to: string;
  date: string; 
  passengers: number;
}

export interface Flight {
  id: string;
  airline: string;
  flightNumber: string;
  from: string;
  to: string;
  departTime: string; 
  arriveTime: string; 
  price: number;
  durationMinutes: number;
}

export interface PassengerInfo {
  fullName: string;
  email: string;
  phone?: string;
}

export interface Booking {
  id: string;
  flightId: string;
  passengers: PassengerInfo[];
  totalAmount: number;
  status: 'PENDING' | 'CONFIRMED' | 'CANCELLED';
}

export interface PaymentRequest {
  bookingId: string;
  amount: number;
  method: 'CARD' | 'UPI' | 'NETBANKING';
  cardLast4?: string;
}

export interface PaymentResult {
  status: 'SUCCESS' | 'FAILURE';
  transactionId?: string;
  reason?: string;
}
