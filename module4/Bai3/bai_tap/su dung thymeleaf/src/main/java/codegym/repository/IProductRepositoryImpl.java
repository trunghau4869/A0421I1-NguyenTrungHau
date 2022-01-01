package codegym.repository;

import codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class IProductRepositoryImpl implements IProductRepository {
    private static final Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Iphone X", "Apple", "White, Black", 700));
        products.put(2, new Product(2, "Iphone 11", "Apple", "White, Black, Red, Yellow", 800));
        products.put(3, new Product(3, "Iphone 12", "Apple", "White, Black", 1000));
        products.put(4, new Product(4, "Note 10", "Samsung", "White, Black, Pink", 900));
        products.put(5, new Product(5, "Galaxy S20", "Samsung", "White, Black", 800));
        products.put(6, new Product(6, "Iphone 11 pro Max", "Apple", "White, Black", 1100));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getProductId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String search) {
        List<Product> productList = new ArrayList<>(products.values());
        List<Product> productList1 = new ArrayList<>();
        for (Product product : productList
        ) {
            if (product.getProductName().equals(search)) {
                productList1.add(product);
            }
        }

        return productList1;
    }
}
