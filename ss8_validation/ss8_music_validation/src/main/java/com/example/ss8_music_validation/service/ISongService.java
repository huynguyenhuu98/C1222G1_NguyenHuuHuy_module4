package com.example.ss8_music_validation.service;

import com.example.ss8_music_validation.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    void create(Song song);
    Song findById(int id);
    void update(Song song);
}
