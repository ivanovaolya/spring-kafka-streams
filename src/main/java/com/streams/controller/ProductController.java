package com.streams.controller;

import com.streams.model.Product;
import com.streams.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void sendProduct(@RequestBody final Product product) {
        productService.sendProduct(product);
    }

}
