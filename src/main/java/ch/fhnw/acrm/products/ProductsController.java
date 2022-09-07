package ch.fhnw.acrm.products;


//All resources for API

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductsController {


    private final ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public List<Products> getProducts() {
        return productsService.getProducts();
    }

//    @PostMapping
//    public String saveProducts(Products products){
//        productsRepository
//    }
}
