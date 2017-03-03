import {Component} from '@angular/core';

import {MovieService} from '../movie-service/movie.service';


@Component({
    templateUrl: 'admin-add.component.html'
})
export class AdminAddComponent {

    movie: any = {};

    constructor(private movieService: MovieService) {}


    addMovie() {
        this.movieService.createMovie(this.movie)
            .subscribe(
                comment => this.movie = comment,
                error => console.log(error)
            );
        location.reload();
    }
}