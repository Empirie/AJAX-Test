package ch.fhnw.acrm.orders;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/orders")
public class OrdersController {

    //inject repository in service UNSURE!!!!
    private final OrdersRepository ordersRepository;
    private final OrdersService ordersService;


    @Autowired
    public OrdersController(OrdersRepository ordersRepository, OrdersService ordersService){
        this.ordersRepository = ordersRepository;
        this.ordersService = ordersService;}



    @GetMapping
    public String getOrdersView(){
        return "user/bootstraptest.html";
    }





//    @GetMapping
//    public List<Orders> getOrders(){return ordersService.getOrders();}

}
