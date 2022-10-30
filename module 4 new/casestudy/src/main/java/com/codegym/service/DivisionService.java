package com.codegym.service;

import com.codegym.model.Division;
import com.codegym.repository.IDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DivisionService implements IDivisionService{
    @Autowired
    private IDivisionRepository divisionRepository;
    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    @Override
    public void saveDivision(Division division) {

    }

    @Override
    public void deleteDivision(int id) {

    }

    @Override
    public Division findDivisionById(int id) {
        return null;
    }


}
