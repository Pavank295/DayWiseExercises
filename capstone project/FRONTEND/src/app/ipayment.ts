export interface IPayment {
  id?: number;
  bookingId: number;
  amount: number;
  status?: string;
  modeOfPayment?: string;
  accountNumber?: string;
  cvv?: number;
}