package ch.fhnw.acrm.checkout;

import ch.fhnw.acrm.deliverydata.DeliveryService;
import ch.fhnw.acrm.distancecalc.DistanceAPI;
import ch.fhnw.acrm.orders.Orders;
import ch.fhnw.acrm.orders.OrdersService;
import ch.fhnw.acrm.transportcosts.TransportCostsRepository;
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
    private final TransportCostsRepository transportCostsRepository;


    public CheckoutController(OrdersService ordersService, DeliveryService deliveryService, TransportCostsRepository transportCostsRepository) {
        this.ordersService = ordersService;
        this.deliveryService = deliveryService;
        this.transportCostsRepository = transportCostsRepository;
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
        sumOfPallets = Math.ceil(sumOfPallets);
        System.out.println("Palletsizer ounded up " + sumOfPallets);
        double num = distance;
        System.out.println("This is distance input " + num);
        num = Math.round(num / 30000);
        System.out.println("This is num " + num);

        if(num <= 1){
            num = 1;
        }
        System.out.println("Num = 1 correction " + num);


        //extract palletPriceattribute # from double
        //I can't think of an elegant solution
        double fprice;

        for (sumOfPallets=1;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }

        for (sumOfPallets=2;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        for (sumOfPallets=3;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        for (sumOfPallets=4;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        for (sumOfPallets=5;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        for (sumOfPallets=6;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        for (sumOfPallets=7;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        for (sumOfPallets=8;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        for (sumOfPallets=9;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        for (sumOfPallets=10;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        for (sumOfPallets=11;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        for (sumOfPallets=12;;){
            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
            System.out.println(fprice);
        }
        //Get final cost...finally end in sight





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
