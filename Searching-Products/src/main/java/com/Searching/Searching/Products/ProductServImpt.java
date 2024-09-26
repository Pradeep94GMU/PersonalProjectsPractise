package com.Searching.Searching.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ProductServImpt implements ProductService{

    private final ProdRepo prodRepo;

    @Autowired
    public ProductServImpt(ProdRepo prodRepo) {
        this.prodRepo = prodRepo;
    }

    @Override
    public List<Product> getAllProduct() {
        return prodRepo.findAll();
    }

    @Override
    public void addNewProduct(Product product) {
        prodRepo.save(product);
    }

    @Override
    public void insertDummyData() {
        List<Product> products = new ArrayList<>();
        Random random = new Random();

        // Arrays for random selection of names, categories, and departments
        String[] productNames = {"Laptop", "Mobile Phone", "Headphones", "Smart Watch", "Tablet", "Camera", "Television", "Printer", "Monitor", "Keyboard"};
        String[] categories = {"Electronics", "Home Appliances", "Furniture", "Clothing", "Sports"};
        String[] departments = {"Sales", "Support", "Development"};

        for (int i = 1; i <= 100; i++) {
            Product product = new Product();

            // Choose random product name, category, and department
            String randomName = productNames[random.nextInt(productNames.length)];
            String randomCategory = categories[random.nextInt(categories.length)];
            String randomDepartment = departments[random.nextInt(departments.length)];

            // Set random values to the product
            product.setName(randomName);
            product.setCategory(randomCategory);
            product.setDepartment(randomDepartment);

            // Generate a random price between 50 and 1000
            double randomPrice = 50 + (950 * Math.random());
            product.setPrice(randomPrice);

            products.add(product);
        }

        // Save all products to the database
        prodRepo.saveAll(products);
    }

    @Override
    public List<Product> findProducts(String category, String department, Double price) {
        return prodRepo.findByCategoryAndDepartmentAndPriceLessThan(category,department,price);
    }
}
