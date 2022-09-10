package ch.fhnw.acrm.distancecalc;

import ch.fhnw.acrm.products.Products;
import ch.fhnw.acrm.products.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistanceAPIService {

    private final ProductsRepository productsRepository;

    @Autowired


    public DistanceAPIService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Products> getProducts(){
        return productsRepository.findAll();
    }

    public void addNewProduct(Products product){
        productsRepository.save(product);
    }

    void save(Products product) {

    }

    public void gg(){

    }


}
