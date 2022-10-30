package com.codegym.repository;

import com.codegym.model.employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<employee, Integer> {
    Page<employee> findEmployeeBy(Pageable pageable);

//  @Query(value = "select * from employee where employee_name like concat('%',?1,'%'); ", nativeQuery = true)
//  Page<employee> searchByEmployee_name(String name, Pageable pageable);
//    Page<employee> findByEmployee_name(String name, Pageable pageable);
//
}
