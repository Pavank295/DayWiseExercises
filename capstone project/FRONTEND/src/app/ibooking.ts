export interface IBooking {
  id?: number;
  pnr?: string;
  passengerName: string;
  passengerAge?: number;
  gender?: string;
  email?: string;
  phone?: string;
  status?: string;
  totalPrice?: number;
  numberOfTicket?: number;
  flightId?: number;
}