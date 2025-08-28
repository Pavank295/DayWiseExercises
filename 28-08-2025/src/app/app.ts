import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,      
  imports: [CommonModule], 
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class AppComponent {
  title = 'palindrome-app';
  result: boolean | undefined; 

  isPalindrome(input: string | null | undefined): boolean {
    if (input === null || input === undefined) return false;

    const normalized = input
      .toString()
      .toLowerCase()
      .replace(/[^a-z0-9]/g, '');

    const reversed = normalized.split('').reverse().join('');
    return normalized === reversed;
  }
}
