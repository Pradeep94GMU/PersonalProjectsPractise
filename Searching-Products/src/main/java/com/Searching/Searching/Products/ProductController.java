package com.Searching.Searching.Products;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    private final ProdRepo prodRepo;

    public ProductController(ProductService productService, ProdRepo prodRepo) {
        this.productService = productService;
        this.prodRepo = prodRepo;
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




    @GetMapping("/filter")
    public List<Product> filterProduct(
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String department,
            @RequestParam(required = false) Double price){


            if (category != null && department != null && price != null) {
                return prodRepo.findByCategoryAndDepartmentAndPriceLessThan(category, department, price);
            } else if (category != null && department != null) {
                return prodRepo.findByCategoryAndDepartment(category, department);
            } else if (category != null) {
                return prodRepo.findByCategory(category);
            } else if (department != null) {
                return prodRepo.findByDepartment(department);
            } else if (price != null) {
                return prodRepo.findByPriceLessThan(price);
            } else {
                return prodRepo.findAll();
            }

    }


}
