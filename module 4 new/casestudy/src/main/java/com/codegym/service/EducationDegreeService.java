package com.codegym.service;

import com.codegym.model.education_degree;
import com.codegym.repository.IEducationDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationDegreeService implements IEducateDegreeService{
    @Autowired
    private IEducationDegreeRepository educationDegreeRepository;
    @Override
    public List<education_degree> findAll() {
        return educationDegreeRepository.findAll();
    }

    @Override
    public void saveEducationDegree(education_degree education_degree) {

    }

    @Override
    public void deleteEducationDegree(int id) {

    }

    @Override
    public education_degree findEducationDegreeById(int id) {
        return null;
    }
}
