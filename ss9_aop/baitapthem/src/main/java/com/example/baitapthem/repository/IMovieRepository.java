package com.example.baitapthem.repository;

import com.example.baitapthem.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovieRepository extends JpaRepository<Movie,Integer> {
}
