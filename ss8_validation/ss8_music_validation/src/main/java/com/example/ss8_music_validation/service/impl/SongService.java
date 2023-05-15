package com.example.ss8_music_validation.service.impl;

import com.example.ss8_music_validation.model.Song;
import com.example.ss8_music_validation.repository.ISongRepository;
import com.example.ss8_music_validation.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository iSongRepository;

    @Override
    public List<Song> findAll() {
        return (List<Song>) iSongRepository.findAll();
    }

    @Override
    public void create(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public Song findById(int id) {
        return iSongRepository.findById(id).get();
    }

    @Override
    public void update(Song song) {
        iSongRepository.save(song);
    }
}
