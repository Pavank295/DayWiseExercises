import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  template: `
    <header class="app-header">
      <h1>Flight Booker</h1>
    </header>
    <main class="app-main">
      <router-outlet></router-outlet>
    </main>
    <footer class="app-footer">© {{year}} Flight Booker</footer>
  `,
  styles: [`
    .app-header { padding: 12px 20px; background:#0d47a1; color:#fff; }
    .app-main { padding: 20px; max-width: 1000px; margin: 0 auto; }
    .app-footer { margin-top: 40px; padding: 12px 20px; background:#f3f3f3; color:#555; text-align:center; }
  `]
})
export class AppComponent {
  year = new Date().getFullYear();
}
