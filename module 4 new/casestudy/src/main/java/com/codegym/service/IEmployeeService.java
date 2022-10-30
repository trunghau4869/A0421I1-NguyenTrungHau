package com.codegym.service;

import com.codegym.model.employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IEmployeeService {
    Page<employee> findAll(Pageable pageable);

    void save(employee employee);

    void edit(employee employee);

    void delete(employee employee);

    employee findById(int id);

//    Page<employee> findByEmployee_name(String name, Pageable pageable);
//    Page<employee> searchByEmployee_name(String name, Pageable pageable);
}
