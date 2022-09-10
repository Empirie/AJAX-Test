package ch.fhnw.acrm.Cart;


import ch.fhnw.acrm.products.Products;
import ch.fhnw.acrm.products.ProductsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//https://github.com/syqu22/spring-boot-shop-sample/blob/master/src/main/java/com/syqu/shop/controller/CartController.java
@Controller
public class CartController {

    private static final Logger logger = LoggerFactory.getLogger(CartController.class);
    private final CartService shoppingCartService;
    private final ProductsService productsService;

    @Autowired
    public CartController(CartService shoppingCartService, ProductsService productsService) {
        this.shoppingCartService = shoppingCartService;
        this.productsService = productsService;
    }



}
