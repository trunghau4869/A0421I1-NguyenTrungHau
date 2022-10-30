package com.codegym.repository;

import com.codegym.model.education_degree;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IEducationDegreeRepository extends JpaRepository<education_degree, Integer> {
}
