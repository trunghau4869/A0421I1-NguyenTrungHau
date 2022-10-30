package com.codegym.service;

import com.codegym.model.Discount;
import com.codegym.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class DiscountService implements IDiscountService<Discount> {
    @Autowired
    private DiscountRepository discountRepository;

    @Override
    public Page<Discount> findAll(Pageable pageable) {
        return discountRepository.findAll(pageable);
    }

    @Override
    public void save(Discount discount) {
        discountRepository.save(discount);
    }

    @Override
    public void delete(Discount discount) {
        discountRepository.delete(discount);
    }

    @Override
    public Discount findById(int id) {
        return discountRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Discount> findByName(String name, Pageable pageable) {
        return discountRepository.findByLevelDiscountContaining(name, pageable);
    }

    @Override
    public Page<Discount> findByTimeStart(String name, Pageable pageable) {
        return discountRepository.findByTimeStartContaining(name, pageable);
    }

    @Override
    public Page<Discount> findByTimeEnd(String name, Pageable pageable) {
        return discountRepository.findByTimeEndContaining(name, pageable);
    }

//    @Override
//    public Page<Discount> findByDiscountAndTimeEndAndTimeStart(String name, Pageable pageable) {
//        return null;
//    }

    @Override
    public Page<Discount> findByDiscountAndTimeEndAndTimeStart(String name,String name1,String name2, Pageable pageable) {
        return discountRepository.findByLevelDiscountAndTimeStartAndTimeEndContaining(name,name1,name2, pageable);
    }
}
