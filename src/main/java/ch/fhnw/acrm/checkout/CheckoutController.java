package ch.fhnw.acrm.checkout;

import ch.fhnw.acrm.orders.Orders;
import ch.fhnw.acrm.orders.OrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RequestMapping
@Controller
public class CheckoutController {

    private final OrdersService ordersService;



    public CheckoutController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }


    @GetMapping(path = "/checkout")
    public ModelAndView showCheckout() {

        ModelAndView mav = new ModelAndView("orders/list-orders-page");

        List<Orders> agentOrders = ordersService.getOrders();
        mav.addObject("orders", agentOrders);
        for (Orders orders: agentOrders){
            System.out.println(orders.toString());
        }

//        toString(ordersService.getOrders())
        return mav;
    }


}
