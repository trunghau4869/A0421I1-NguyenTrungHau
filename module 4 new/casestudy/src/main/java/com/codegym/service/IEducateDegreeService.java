package com.codegym.service;

import com.codegym.model.education_degree;

import java.util.List;

public interface IEducateDegreeService {
    List<education_degree> findAll();
    void saveEducationDegree(education_degree education_degree);
    void deleteEducationDegree(int id);
    education_degree findEducationDegreeById(int id);
}
