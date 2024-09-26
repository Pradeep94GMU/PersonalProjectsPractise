package com.Searching.Searching.Products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdRepo extends JpaRepository<Product, Long> {

    public List<Product> findByCategoryAndDepartmentAndPriceLessThan(String category, String department, Double price);

    List<Product> findByCategoryAndDepartment(String category, String department);

    List<Product> findByCategory(String category);

    List<Product> findByDepartment(String department);

    List<Product> findByPriceLessThan(Double price);
}
