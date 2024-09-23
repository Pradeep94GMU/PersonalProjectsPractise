package com.Searching.Searching.Products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdRepo extends JpaRepository<Product, Long> {
}
