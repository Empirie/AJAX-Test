package ch.fhnw.acrm.products;

import org.springframework.http.ResponseEntity;

public class ProductsService {


    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok(this.productRepository.findAll());

    }

}
