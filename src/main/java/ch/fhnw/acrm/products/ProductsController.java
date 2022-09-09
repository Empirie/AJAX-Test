package ch.fhnw.acrm.products;


//All resources for API



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductsController {


    private final ProductsService productsService;
    private final ProductsRepository productsRepository;

    @Autowired
    public ProductsController(ProductsService productsService, ProductsRepository productsRepository) {

        this.productsService = productsService;
        this.productsRepository = productsRepository;
    }

//@RequestMapping(path = "/products")
//public String productindex(){
//        return "productspage";
//}



//    @GetMapping
//    String getProductsPage(Model model1){
//
//        model1.addAttribute("products1", productsRepository.findById(1L).get().getName());
//        model1.addAttribute("products2", productsRepository.findById(2L).get().getName());
//        model1.addAttribute("products3", productsRepository.findById(5L).get().getName());
//        model1.addAttribute("products4", productsRepository.findById(6L).get().getName());
//
//
//            return "productspage";
//    }


//
//        @GetMapping(value = "/save")
//        public ModelAndView showProductForm(@RequestParam Long id){
//
//
//        //Code to save data
//        ModelAndView mav = new ModelAndView("productspage");
//        Products newProduct = new Products();
////        mav.setViewName("products_info");
//        mav.addObject("products", newProduct);
//                return mav;
//    }
//
//
//    @PostMapping(path = "/save")
//    public String saveProduct(@ModelAttribute Products products) {
//        productsRepository.save(products);
//        return "product_info";
//    }

//
//    @RequestMapping(path = "/new")
//    public void createNewProduct(@RequestBody Products product){
//        this.productsService.addNewProduct(product);
//    }

//    @RequestMapping(path = "/save")
//    public String save

//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public ModelAndView save(@ModelAttribute Products products){
//
//        System.out.println("New Product =" + products);
//
//        //Code to save data
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("products_info");
//        modelAndView.addObject("products", products);
//                return modelAndView;
//    }


    //This works!!!
//    @GetMapping
//    public List<Products> getProducts() {
//        return productsService.getProducts();
//    }

//    @PostMapping
//    public String saveProducts(Products products){
//        productsRepository
//    }



    @GetMapping({"/product_list"})
    public ModelAndView getAllProducts() {
        ModelAndView mav = new ModelAndView("list-products");
        mav.addObject("products", productsRepository.findAll());
        return mav;
    }

    @GetMapping("/products")
    public ModelAndView addProductsForm() {
        ModelAndView mav = new ModelAndView("productspage");
        Products newProduct = new Products();
        mav.addObject("product", newProduct);
        return mav;
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute Products employee) {
        productsRepository.save(employee);
        return "product_info";
    }


    @GetMapping("/deleteProducts")
    public String deleteProduct(@RequestParam Long id) {
        productsRepository.deleteById(id);
        return "redirect:/list";
    }
}
