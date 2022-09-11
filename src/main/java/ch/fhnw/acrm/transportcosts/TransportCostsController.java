package ch.fhnw.acrm.transportcosts;


import ch.fhnw.acrm.products.Products;
import ch.fhnw.acrm.products.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/transport")
public class TransportCostsController {

    @Autowired
    public final TransportCostsRepository transportCostsRepository;
    public final ProductsRepository productsRepository;

    public TransportCostsController(TransportCostsRepository transportCostsRepository, ProductsRepository productsRepository) {
        this.transportCostsRepository = transportCostsRepository;
        this.productsRepository = productsRepository;
    }



    @GetMapping({"/product_list"})
    public ModelAndView listAllProducts() {
        ModelAndView mav = new ModelAndView("products/list-products-page");
        mav.addObject("products", productsRepository.findAll());
        return mav;
    }

    @GetMapping("/products")
    public ModelAndView addProductsForm() {
        ModelAndView mav = new ModelAndView("products/save-products-page");
        Products newProduct = new Products();
        mav.addObject("product", newProduct);
        return mav;
    }

    @PostMapping("/saveProduct")
    public String saveTC(@ModelAttribute TransportCosts transport) {
        transportCostsRepository.save(transport);
        return "product_info";
    }


    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long id) {
        ModelAndView mav = new ModelAndView("products/save-products-page");
        Products product = productsRepository.findById(id).get();
        mav.addObject("product", product);
        return mav;
    }

    @GetMapping("/deleteProducts")
    public String deleteProduct(@RequestParam Long id) {
        productsRepository.deleteById(id);
        return "redirect:/list";
    }




}
