package com.codegym.service;

import com.codegym.model.employee;
import com.codegym.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepository employeeRepository;
//    @Override
//    public List<employee> findAll() {
//        return employeeRepository.findAll();
//    }

    @Override
    public Page<employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void save(employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void edit(employee employee) {

    }

    @Override
    public void delete(employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public employee findById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

//    @Override
//    public Page<employee> findByEmployee_name(String name, Pageable pageable) {
//        return employeeRepository.findByEmployee_name(name,pageable);
//    }
//
//    @Override
//    public Page<employee> searchByEmployee_name(String name, Pageable pageable) {
//        return employeeRepository.searchByEmployee_name(name,pageable);
//    }
}
