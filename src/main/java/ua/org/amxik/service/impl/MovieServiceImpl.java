package ua.org.amxik.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.org.amxik.models.MovieEntity;
import ua.org.amxik.repositories.MovieRepository;
import ua.org.amxik.service.MovieService;

import java.util.List;

/**
 * Created by amxik on 17.02.2019.
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public MovieEntity addMovie(MovieEntity movie) {
        return movieRepository.saveAndFlush(movie);
    }

    @Override
    public void delete(long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public MovieEntity getById(long id) {
        return movieRepository.getOne(id);
    }

    @Override
    public MovieEntity editMovie(MovieEntity movie) {
        return movieRepository.saveAndFlush(movie);
    }

    @Override
    public List<MovieEntity> getAll() {
        return movieRepository.findAll();
    }
}
