package com.codegym.service;

import com.codegym.model.Position;
import com.codegym.repository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionService implements IPositionService {
    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public void savePosition(Position position) {

    }

    @Override
    public void deletePosition(int id) {

    }

    @Override
    public Position findPositionById(int id) {
        return null;
    }
}
