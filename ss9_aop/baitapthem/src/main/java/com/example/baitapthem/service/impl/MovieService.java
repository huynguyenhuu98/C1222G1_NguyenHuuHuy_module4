package com.example.baitapthem.service.impl;

import com.example.baitapthem.model.Movie;
import com.example.baitapthem.repository.IMovieRepository;
import com.example.baitapthem.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {
    @Autowired
    private IMovieRepository iMovieRepository;
    @Override
    public List<Movie> display() {
        return this.iMovieRepository.findAll();
    }

    @Override
    public void save(Movie movie) {
        this.iMovieRepository.save(movie);
    }

    @Override
    public void delete(int id) {
        this.iMovieRepository.deleteById(id);
    }
}
