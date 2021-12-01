package Model.service;

import Model.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    boolean save(Product contract);
    void delete(int id);
    boolean update(int ind, Product contract);
}
