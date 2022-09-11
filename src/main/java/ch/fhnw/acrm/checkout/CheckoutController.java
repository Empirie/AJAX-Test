package ch.fhnw.acrm.checkout;

import ch.fhnw.acrm.deliverydata.DeliveryService;
import ch.fhnw.acrm.distancecalc.DistanceAPI;
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
    private final DeliveryService deliveryService;


    public CheckoutController(OrdersService ordersService, DeliveryService deliveryService) {
        this.ordersService = ordersService;
        this.deliveryService = deliveryService;
    }
//
// x =   {
//        "3500" : [{"palletSize" : "4" , "cost" : "1000"},{"palletsize" : "7", "cost" : "2000"}]
//    }

    @GetMapping(path = "/checkout")
    public ModelAndView showCheckout() throws Exception {

        ModelAndView mav = new ModelAndView("orders/list-orders-page");

        List<Orders> agentOrders = ordersService.getOrders();
        String x = deliveryService.getGodString();
        System.out.println(x);
//        for (Orders orders: agentOrders){
//
//        }
        Long distance = DistanceAPI.getData(x);
        double sumOfPallets = 0.0;

        for (Orders order: agentOrders){
           sumOfPallets += order.getProducts().getPalletSize() * order.getProduct_quantity();
        }
        System.out.println("Distance = "  +distance+ " Palletsize =" +sumOfPallets);
        double num = distance;
        System.out.println("This is distance input " + num);
        num = Math.round(num / 30000);
        System.out.println("This is num " + num);

        if(num <= 1: num = 1)


//        double numtesti = 89001.43;
//        numtesti = Math.round(numtesti / 30000);
//        System.out.println("This is numtest " + numtesti);
//        double far = 120001.43;
//        far = Math.round(far / 30000);
//        System.out.println("This is numtest " + far);
        mav.addObject("orders", agentOrders);
//        for (Orders orders: agentOrders){
//            System.out.println(orders.toString());
//        }

//        toString(ordersService.getOrders())
        return mav;
    }


}
