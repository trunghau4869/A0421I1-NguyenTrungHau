package com.codegym.cms.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGeneralRepository<T> {
    Page<T> findAll(Pageable pageable);

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
