import {Component} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {MovieService} from '../movie-service/movie.service';

@Component({
    templateUrl: 'movie-detail.component.html'
})
export class MovieDetailComponent {

    movie: any = {};

    constructor(private route: ActivatedRoute, private movieService: MovieService) {
        this.route.params.subscribe(
            params => {
                movieService.getMovieById(params['id'])
                    .subscribe(
                        movie => this.movie = movie,
                        error => console.log(error)
                    );
            });
    }
}