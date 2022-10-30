package com.codegym.service;

import com.codegym.model.Division;

import java.util.List;

public interface IDivisionService {
    List<Division> findAll();
    void saveDivision(Division division);
    void deleteDivision(int id);
    Division findDivisionById(int id);
}
