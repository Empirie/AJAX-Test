package ch.fhnw.acrm.products;

import ch.fhnw.acrm.orders.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch.fhnw.acrm.distancecalc.DistanceAPI.*;

import java.util.List;


@Service
public class ProductsService {

    private final ProductsRepository productsRepository;



    @Autowired
    public ProductsService(ProductsRepository productsRepository) {
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






}
