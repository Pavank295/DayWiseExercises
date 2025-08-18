import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex15booklist',
  imports: [FormsModule,CommonModule],
  templateUrl: './ex15booklist.html',
  styleUrl: './ex15booklist.css'
})
export class Ex15booklist {
  books = Array.from({ length: 10 }, (_, i) => ({
    title: `Book Title ${i + 1}`,
    description: `This is the description for book ${i + 1}.`,
    image: `https://books.google.com/books/content?id=zyTCAlFPjgYC&printsec=frontcover&img=1&zoom=3`
  }));

}
