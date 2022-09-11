package ch.fhnw.acrm.transportcosts;


import ch.fhnw.acrm.orders.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TransportCostsController {

    public final TransportCostsRepository transportCostsRepository;

    public TransportCostsController(TransportCostsRepository transportCostsRepository) {
        this.transportCostsRepository = transportCostsRepository;
    }



//    for (
//    Orders order: agentOrders){
//        sumOfPallets += order.getProducts().getPalletSize() * order.getProduct_quantity();
//    }



//    public double getFinal(){
//
//        switch ((int) sumOfPallets) {
//            case 1:
//                double fprice = transportCostsRepository.getById((long) num).getPalletPrice1();
//                break;
//            case 2:  fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            case 3:  fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            case 4:  fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            case 5:  fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            case 6:  fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            case 7:  fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            case 8:  fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            case 9:  fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            case 10: fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            case 11: fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            case 12: fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//            default: fprice = transportCostsRepository.getById((long)num).getPalletPrice2();
//                break;
//
//
//        }


    


}
