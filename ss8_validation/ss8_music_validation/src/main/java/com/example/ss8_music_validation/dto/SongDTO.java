package com.example.ss8_music_validation.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDTO {
    private Integer id;

    @NotEmpty(message = "Can not empty")
    @Size(max = 800, min = 1, message = "maximum 800 characters")
    @Pattern(regexp = "^((?=[A-Za-z0-9,])(?![!.#$@_+,?-]).)*$", message = "No special characters")
    private String name;

    @NotEmpty(message = "Can not empty")
    @Size(max = 300, min = 1, message = "maximum 300 characters")
    @Pattern(regexp = "^((?=[A-Za-z0-9,])(?![!.#$@_+,?-]).)*$", message = "No special characters")
    private String singer;

    @NotEmpty(message = "Can not empty")
    @Size(max = 1000, min = 1, message = "maximum 1000 characters")
    @Pattern(regexp = "^[a-zA-Z0-9, ]*$", message = "No special characters")
    private String category;

    public SongDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
