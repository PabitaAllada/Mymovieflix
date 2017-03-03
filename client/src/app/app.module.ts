import {NgModule} from '@angular/core';
import {HttpModule} from '@angular/http';
import {RouterModule, Routes} from '@angular/router';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent}  from './app.component';
import {MovieListComponent} from './movie-list/movie-list.component';
import {MovieDetailComponent} from './movie-detail/movie-detail.component';
import {NotFoundComponent} from './not-found/not-found.component';
import {AdminAddComponent} from './admin-add/admin-add.component';
import {AdminUpdateComponent} from './admin-update/admin-update.component';
import {AdminDeleteComponent} from './admin-delete/admin-delete.component';

import {MovieService} from './movie-service/movie.service';


const appRoutes: Routes = [
    {path: 'movies', component: MovieListComponent},
    {path: 'movies/:id', component: MovieDetailComponent},
    {path: 'movies', component: AdminAddComponent},
    {path: 'movies/:id', component: AdminUpdateComponent},
    {path: 'movies/:id', component: AdminDeleteComponent},
    {path: '', redirectTo: 'movies', pathMatch: 'full'},
    {path: '**', component: NotFoundComponent}
];

@NgModule({
    imports: [BrowserModule, HttpModule, RouterModule.forRoot(appRoutes)],
    declarations: [AppComponent, MovieListComponent, MovieDetailComponent, AdminAddComponent, AdminUpdateComponent, AdminDeleteComponent, NotFoundComponent],
    providers: [MovieService],
    bootstrap: [AppComponent]
})
export class AppModule {

}

console.log('Running');
