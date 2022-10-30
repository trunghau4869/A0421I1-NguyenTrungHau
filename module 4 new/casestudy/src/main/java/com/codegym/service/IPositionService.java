package com.codegym.service;

import com.codegym.model.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();
    void savePosition(Position position);
    void deletePosition(int id);
    Position findPositionById(int id);
}
