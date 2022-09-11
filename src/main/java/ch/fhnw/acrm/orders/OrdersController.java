package ch.fhnw.acrm.orders;


import ch.fhnw.acrm.distancecalc.DistanceAPI;
import ch.fhnw.acrm.products.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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





    @GetMapping({"/list"})
    public ModelAndView getAllOrders() {
        ModelAndView mav = new ModelAndView("orders/list-orders-page");
        mav.addObject("orders", ordersRepository.findAll());
        return mav;
    }

    @GetMapping("/addOrdersView")
    public ModelAndView addOrdersForm() {
        ModelAndView mav = new ModelAndView("orders/save-orders-page");
        Orders newOrder = new Orders();
        mav.addObject("orders", newOrder);
        return mav;
    }

    @PostMapping("/saveOrders")
    public String saveOrders(@ModelAttribute Orders orders) {
        ordersRepository.save(orders);
        return "orders_info";
    }


    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long id) {
        ModelAndView mav = new ModelAndView("orders/save-orders-page");
        Orders orders = ordersRepository.findById(id).get();
        mav.addObject("orders", orders);
        return mav;
    }

    @GetMapping("/deleteOrders")
    public String deleteOrders(@RequestParam Long id) {
        ordersRepository.deleteById(id);
        return "redirect:/list";
    }

    //Product order page
    @GetMapping("/orderslist")
    public ModelAndView seeOrders() {
        ModelAndView mav = new ModelAndView("orders/list-orders-page");
        Orders orders = new Orders();
        mav.addObject("order", seeOrders());
        return mav;
    }

//    @GetMapping
//    public String getOrdersView(Model model) {
//        model.addAttribute("currentorders", ordersRepository.findById(1L).get());
//
//        return "user/bootstraptest";
//    }
//
//    @GetMapping(path = "costs")
//    public String getOrdersCosts(Model model) throws Exception {
//
//        long a = DistanceAPI.getData("Florastrasse40,4057Basel");
//        String str = Long.toString(a);
//        model.addAttribute("costs", str);
//        return "costs";
//    }
//
//
//    @PostMapping(path = "/new")
//    public void createNewOrder(@RequestBody Orders order){
//        this.ordersService.addNewOrder(order);
//    }


    // List Orders





//    @GetMapping
//    public List<Orders> getOrders(){return ordersService.getOrders();}

}
