package codegym.services;

import org.springframework.stereotype.Service;

import java.util.List;


public interface IGeneralService<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
