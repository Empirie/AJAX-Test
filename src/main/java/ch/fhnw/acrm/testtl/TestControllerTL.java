package ch.fhnw.acrm.testtl;

import ch.fhnw.acrm.products.Products;
import ch.fhnw.acrm.products.ProductsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class TestControllerTL {

    private final ProductsRepository productsRepository;

    public TestControllerTL(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }
//
//    @GetMapping(path = "/ty")
//    String getThyme(Model model){
//        model.addAttribute("boobs", "more bobs");
//        return "products";
//    }


    @GetMapping(path = "/ty")
    String getTestTL(Model model){
        model.addAttribute("testtl3", "shit is working");
        model.addAttribute("testtl1", productsRepository.findById(1L).get().getPrice());
        model.addAttribute("testtl2", Arrays.asList(
                new TestTL("eFlower", 20, 0.7 ),
                new TestTL("fFlower", 40, 1.6)
        ));
        //This tells thymeleaf what html file to use
        return "testtl";
    }
}
