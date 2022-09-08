package ch.fhnw.acrm.products;


//All resources for API

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
