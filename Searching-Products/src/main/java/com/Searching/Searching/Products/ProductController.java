package com.Searching.Searching.Products;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProduct(){
        return productService.getAllProduct();
    }

    @PostMapping
    public  String addProduct(@RequestBody Product product){
        productService.addNewProduct(product);
        return "successfully added";
    }


    @GetMapping("/insertAll")
    public void insertDummyData(){
         productService.insertDummyData();
         return;
    }


}
