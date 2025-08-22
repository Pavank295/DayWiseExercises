import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import type { Movie } from '../movie';
import { MovieService } from '../movie-service';

@Component({
  selector: 'app-movie',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './movie.html',
  styleUrl: './movie.css'
})
export class MovieComponent {
  // Readonly signal from service
  movies = this.movieService.movies;

  // Simple form model (plain object makes ngModel easy)
  form: Movie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };

  // Editing flag
  editing = false;

  constructor(private movieService: MovieService) {}

  onSubmit(): void {
    if (this.editing) {
      this.movieService.update({ ...this.form });
    } else {
      this.movieService.add({ ...this.form });
    }
    this.resetForm();
  }

  edit(movie: Movie): void {
    this.form = { ...movie };
    this.editing = true;
  }

  delete(id: number): void {
    this.movieService.remove(id);
    if (this.editing && this.form.movieId === id) {
      this.resetForm();
    }
  }

  cancel(): void {
    this.resetForm();
  }

  private resetForm(): void {
    this.form = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
    this.editing = false;
  }
}
