package com.watch.movie.service;

import com.watch.movie.entity.Movie;
import com.watch.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieDetails(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
