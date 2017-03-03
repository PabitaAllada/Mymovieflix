/**
 * Created by Pabita on 3/2/2017.
 */
import {Component} from '@angular/core';
import {MovieService} from '../movie-service/movie.service';


@Component({
    templateUrl: 'admin-delete.component.html'
})
export class AdminDeleteComponent {

    movie: any = {};

    constructor(private movieService: MovieService) {}


    deleteMovie() {
        this.movieService.deleteMovie(this.movie)
            .subscribe(
                comment => this.movie = comment,
                error => console.log(error)
            );
        location.reload();
    }
}