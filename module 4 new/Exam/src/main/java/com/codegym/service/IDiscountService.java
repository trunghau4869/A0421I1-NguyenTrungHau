package com.codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IDiscountService<Product> {

    Page<Product> findAll(Pageable pageable);

    void save(Product product);

    void delete(Product product);

    Product findById(int id);

    Page<Product> findByName(String name, Pageable pageable);

    Page<Product> findByTimeStart(String name, Pageable pageable);

    Page<Product> findByTimeEnd(String name, Pageable pageable);

    Page<Product> findByDiscountAndTimeEndAndTimeStart(String name,String name1,String name2, Pageable pageable);


}
