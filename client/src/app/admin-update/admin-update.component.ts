/**
 * Created by Pabita on 3/2/2017.
 */
import {Component} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {MovieService} from '../movie-service/movie.service';
@Component({
    templateUrl: 'admin-update.component.html'
})
export class AdminUpdateComponent {

    movie: any = {};

    constructor(private route: ActivatedRoute, private router: Router,private movieService: MovieService) {
        this.route.params.subscribe(
            params => {
                movieService.getMovieById(params['id'])
                    .subscribe(
                        movie => this.movie = movie,
                        error => console.log(error)
                    );
            });
    }


    updateMovie() {
        this.movieService.updateMovie(this.movie.id, this.movie)
            .subscribe(
                response => this.router.navigate(['movies',this.movie.id]),
                error => console.log(error)
            );
        location.reload();
    }
}