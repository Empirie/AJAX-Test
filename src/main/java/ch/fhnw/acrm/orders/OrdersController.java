package ch.fhnw.acrm.orders;


import ch.fhnw.acrm.distancecalc.DistanceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/orders")
public class OrdersController {

    //inject repository in service UNSURE!!!!

    private final OrdersService ordersService;
    private final OrdersRepository ordersRepository;


    @Autowired
    public OrdersController(OrdersService ordersService, OrdersRepository ordersRepository) {
        this.ordersService = ordersService;
        this.ordersRepository = ordersRepository;
    }


    @GetMapping
    public String getOrdersView(Model model) {
        model.addAttribute("currentorders", ordersRepository.findById(1L).get());

        return "user/bootstraptest";
    }

    @GetMapping(path = "costs")
    public String getOrdersCosts(Model model) throws Exception {

        long a = DistanceAPI.getData("Florastrasse40,4057Basel");
        String str = Long.toString(a);
        model.addAttribute("costs", str);
        return "costs";
    }


    @PostMapping(path = "/new")
    public void createNewOrder(@RequestBody Orders order){
        this.ordersService.addNewOrder(order);
    }





//    @GetMapping
//    public List<Orders> getOrders(){return ordersService.getOrders();}

}
