package com.codegym.repository;

import com.codegym.model.Discount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Integer> {
    Page<Discount> findByLevelDiscountContaining(String name, Pageable pageable);

    Page<Discount> findByTimeStartContaining(String name, Pageable pageable);

    Page<Discount> findByTimeEndContaining(String name, Pageable pageable);

    Page<Discount> findByLevelDiscountAndTimeStartAndTimeEndContaining(String name,String name1,String name2, Pageable pageable);
}
