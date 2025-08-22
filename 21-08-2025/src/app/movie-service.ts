import { Injectable, signal } from '@angular/core';
import type { Movie } from './movie';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  // In-memory state using Signals (reactive)
  private readonly _movies = signal<Movie[]>([
    { movieId: 1, movieName: 'Inception', language: 'English', imdbRating: 8.8 },
    { movieId: 2, movieName: 'RRR',       language: 'Telugu',  imdbRating: 8.0 }
  ]);

  // Expose a readonly signal to components
  movies = this._movies.asReadonly();

  // CREATE
  add(movie: Movie): void {
    this._movies.update(list => [...list, { ...movie }]);
  }

  // READ (all)
  getAll(): Movie[] {
    return this._movies();
  }

  // UPDATE (by id)
  update(movie: Movie): void {
    this._movies.update(list =>
      list.map(m => (m.movieId === movie.movieId ? { ...movie } : m))
    );
  }

  // DELETE (by id)
  remove(movieId: number): void {
    this._movies.update(list => list.filter(m => m.movieId !== movieId));
  }
}
