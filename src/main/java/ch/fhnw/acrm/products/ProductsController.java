package ch.fhnw.acrm.products;


//All resources for API

import ch.fhnw.acrm.orders.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping(path = "/products")
public class ProductsController {

private final ProductsRepository productsRepository;
    private final ProductsService productsService;

    @Autowired
    public ProductsController(ProductsRepository productsRepository, ProductsService productsService) {
        this.productsRepository = productsRepository;
        this.productsService = productsService;
    }







    @GetMapping("/ty")
    String getProducts(Model model){
        model.addAttribute("products1", "shit is working");
        model.addAttribute("products2", Arrays.asList(
                productsRepository.findById(1L),
                productsRepository.findById(3L)
        ));
        return "productspage";
    }

    @PostMapping(path = "/new")
    public void createNewProduct(@RequestBody Products product){
        this.productsService.addNewProduct(product);
    }


    //This works!!!
//    @GetMapping
//    public List<Products> getProducts() {
//        return productsService.getProducts();
//    }

//    @PostMapping
//    public String saveProducts(Products products){
//        productsRepository
//    }
}
