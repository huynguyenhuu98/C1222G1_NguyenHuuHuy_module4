package com.example.ss8_music_validation.repository;

import com.example.ss8_music_validation.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song,Integer> {
}
