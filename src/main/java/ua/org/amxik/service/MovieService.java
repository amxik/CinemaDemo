package ua.org.amxik.service;



import ua.org.amxik.models.MovieEntity;

import java.util.List;

/**
 * Created by amxik on 17.02.2019.
 */
public interface MovieService {

    MovieEntity addMovie(MovieEntity movie);
    void delete(long id);
    MovieEntity getById(long id);
    MovieEntity editMovie(MovieEntity movie);
    List<MovieEntity> getAll();

}
