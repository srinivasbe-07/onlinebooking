package com.srini.onlinebooking.product.controller;

import com.srini.onlinebooking.product.model.Product;
import com.srini.onlinebooking.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")

public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findALl(){
       return  productService.findALl();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }


}
