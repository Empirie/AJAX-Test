package ch.fhnw.acrm.orders;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/orders")
public class OrdersController {

    //inject repository in service UNSURE!!!!

    private final OrdersService ordersService;


    @Autowired
    public OrdersController(OrdersService ordersService){
        this.ordersService = ordersService;}



    @GetMapping
    public String getOrdersView(){
        return "user/bootstraptest";
    }



    @PostMapping(path = "/new")
    public void createNewOrder(@RequestBody Orders order){
        this.ordersService.addNewOrder(order);
    }




//    @GetMapping
//    public List<Orders> getOrders(){return ordersService.getOrders();}

}
