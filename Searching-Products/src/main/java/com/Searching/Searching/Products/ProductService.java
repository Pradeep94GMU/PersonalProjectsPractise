package com.Searching.Searching.Products;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public List<Product> getAllProduct();

    public void addNewProduct(Product product);

    public void insertDummyData();

}
