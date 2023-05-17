package com.example.baitapthem.dto;

import javax.validation.constraints.Pattern;
import java.time.LocalDate;

public class MovieDTO {
    @Pattern(regexp = "^CI-\\d{4}$", message = "CI-XXXX")
    private int idMovie;
    private String name;
    private LocalDate date;
    private int count;

    public MovieDTO() {
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
