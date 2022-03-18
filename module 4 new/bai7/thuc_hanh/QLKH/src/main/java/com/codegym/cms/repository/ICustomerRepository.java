package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerRepository extends IGeneralRepository {
    void save(Customer customer);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
