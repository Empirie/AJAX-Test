package ch.fhnw.acrm.products;


//All resources for API



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




@Controller
public class ProductsController {


    private final ProductsService productsService;
    private final ProductsRepository productsRepository;

    @Autowired
    public ProductsController(ProductsService productsService, ProductsRepository productsRepository) {

        this.productsService = productsService;
        this.productsRepository = productsRepository;
    }




    @GetMapping(path = "/products")
    String getProductsPage(Model model1){

        model1.addAttribute("products1", productsRepository.findById(1L).get().getName());
        model1.addAttribute("products2", productsRepository.findById(2L).get().getName());
        model1.addAttribute("products3", productsRepository.findById(5L).get().getName());
        model1.addAttribute("products4", productsRepository.findById(6L).get().getName());


            return "productspage";
    }

    @RequestMapping(path = "/new")
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
