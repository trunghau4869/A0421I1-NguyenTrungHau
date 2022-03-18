package com.codegym.service;

import com.codegym.model.Song;
import com.codegym.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService implements ISongService{
    @Autowired
    private SongRepository songRepository;
    @Override
    public void save(Song song) {
        songRepository.save(song);
    }

    @Override
    public Song findById(Long id) {
        return songRepository.findById(id);
    }
}
