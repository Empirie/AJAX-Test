package ch.fhnw.acrm.view;


import ch.fhnw.acrm.orders.OrdersRepository;
import ch.fhnw.acrm.products.ProductsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {


    public final ProductsRepository productsRepository;
    public final OrdersRepository   ordersRepository;

    public ViewController(ProductsRepository productsRepository, OrdersRepository ordersRepository) {
        this.productsRepository = productsRepository;
        this.ordersRepository = ordersRepository;
    }

    @GetMapping(path = "/indexproduct")
    public String productOneView(Model model){
        model.addAttribute("product1", productsRepository.getById(1L).getName()
                +productsRepository.getById(1L).getPrice());
        return "indexproduct";

    }


}
