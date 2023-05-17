package com.example.baitapthem.service;

import com.example.baitapthem.model.Movie;

import java.util.List;

public interface IMovieService {
    List<Movie> display();
    void save (Movie movie);
    void delete(int id);
}
