package Service;

import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> product;
    //    id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất.
    static {
        product = new HashMap<>();
        product.put(1,new Product(1,"Tivi",5000000,"television","LG"));
        product.put(2,new Product(2,"Tivi",6000000,"television","LG"));
        product.put(3,new Product(3,"Tivi",7000000,"television","LG"));
        product.put(4,new Product(4,"Tivi",8000000,"television","LG"));
        product.put(5,new Product(5,"Tivi",9000000,"television","LG"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(product.values());
    }

    @Override
    public void save(Product customer) {
        product.put(customer.getId(), customer);
    }

    @Override
    public Product findById(int id) {
        return product.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        product.put(id, customer);
    }

    @Override
    public void remove(int id) {
        product.remove(id);
    }
}
