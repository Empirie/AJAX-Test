package ch.fhnw.acrm.checkout;

import ch.fhnw.acrm.deliverydata.DeliveryService;
import ch.fhnw.acrm.distancecalc.DistanceAPI;
import ch.fhnw.acrm.orders.Orders;
import ch.fhnw.acrm.orders.OrdersService;
import ch.fhnw.acrm.transportcosts.TransportCostsRepository;
import ch.fhnw.acrm.transportcosts.TransportCostsService;
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
    private final TransportCostsService transportCostsService;


    public CheckoutController(OrdersService ordersService, DeliveryService deliveryService, TransportCostsRepository transportCostsRepository, TransportCostsService transportCostsService) {
        this.ordersService = ordersService;
        this.deliveryService = deliveryService;
        this.transportCostsRepository = transportCostsRepository;
        this.transportCostsService = transportCostsService;
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


        //Check!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        long distance = DistanceAPI.getData(x);
        double sumOfPallets = 0.0;
        long plong;


        for (Orders order: agentOrders){
           sumOfPallets += order.getProducts().getPalletSize() * order.getProduct_quantity();
        }
        System.out.println("Distance = "  +distance+ " Palletsize =" +sumOfPallets);
        sumOfPallets = Math.ceil(sumOfPallets);
        plong = (long) sumOfPallets;
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
//        boolean choice = (int)sumOfPallets;
        double fprice;


//        if (sumOfPallets==1){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice1();
//            System.out.println(fprice);
//        }
//
//        else if (sumOfPallets==2){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//            System.out.println(fprice);
//        }
//        else if (sumOfPallets==3){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice3();
//            System.out.println(fprice);
//        }
//        else if (sumOfPallets==4){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice4();
//            System.out.println(fprice);
//        }
//        else if (sumOfPallets==5){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice5();
//            System.out.println(fprice);
//        }
//        else if (sumOfPallets==6){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice6();
//            System.out.println(fprice);
//        }
//        else if (sumOfPallets==7){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice7();
//            System.out.println(fprice);
//        }
//        else if (sumOfPallets==8){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice8();
//            System.out.println(fprice);
//        }
//        else if (sumOfPallets==9){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice9();
//            System.out.println(fprice);
//        }
//        else if (sumOfPallets==10){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice10();
//            System.out.println(fprice);
//        }
//        else if (sumOfPallets==11){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice11();
//            System.out.println(fprice);
//        }
//        else if (sumOfPallets==12){
//            fprice = transportCostsRepository.getById((long)num).getPalletPrice12();
//            System.out.println(fprice);
//        }




        System.out.println(fprice);
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
