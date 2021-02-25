package service;

import model.Product;

import java.util.List;


public interface IProductService {
    void insertProduct(Product product);

    List<Product> getAllProduct();

    boolean delProduct(int id);

    boolean updateProduct(Product product);

    List<Product> findByName(String name);

    Product selectProduct(int id);


}
