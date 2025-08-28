import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app';

describe('AppComponent - isPalindrome()', () => {
  let component: AppComponent;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AppComponent]
    }).compileComponents();

    const fixture = TestBed.createComponent(AppComponent);
    component = fixture.componentInstance;
  });

  it('should return true for "madam"', () => {
    expect(component.isPalindrome('madam')).toBeTrue();
  });

  it('should return true for a sentence palindrome ignoring spaces/punctuation', () => {
    expect(component.isPalindrome('A man, a plan, a canal: Panama')).toBeTrue();
  });

  it('should return false for "hello"', () => {
    expect(component.isPalindrome('hello')).toBeFalse();
  });

  it('should consider empty string a palindrome', () => {
    expect(component.isPalindrome('')).toBeTrue();
  });

  it('should return false for null/undefined', () => {
    expect(component.isPalindrome(null as any)).toBeFalse();
    expect(component.isPalindrome(undefined as any)).toBeFalse();
  });

  it('should handle numeric palindromes as strings', () => {
    expect(component.isPalindrome('12321')).toBeTrue();
    expect(component.isPalindrome('12345')).toBeFalse();
  });
});
