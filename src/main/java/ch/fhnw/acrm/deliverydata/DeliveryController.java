package ch.fhnw.acrm.deliverydata;


import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.data.repository.AgentRepository;
import ch.fhnw.acrm.products.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class DeliveryController {

    private final AgentService agentService;
    private final AgentRepository agentRepository;
    private final DeliveryRepository deliveryRepository;
    private final DeliveryService deliveryService;

    @Autowired
    public DeliveryController(AgentService agentService, AgentRepository agentRepository, DeliveryRepository deliveryRepository, DeliveryService deliveryService) {
        this.agentService = agentService;
        this.agentRepository = agentRepository;
        this.deliveryRepository = deliveryRepository;
        this.deliveryService = deliveryService;
    }

//
//    @RequestMapping(path = "/form")
//    public String showForm() {
//
//        return "userdatainput";
//    }
//
//
//
//    @RequestMapping(path = "/pricing")
//    public String getDeliveryData(Model model) {
//        model.addAttribute("distance",
//                deliveryRepository.getById(1L).getStreetname()+
//                deliveryRepository.getById(1L).getStreetnumber()+
//                deliveryRepository.getById(1L).getPobox()+
//                deliveryRepository.getById(1L).getCityname());
//
//        return "distance";
//    }
//
//
//
//    @RequestMapping(path = "/address")
//    public String addDeliveryAddress(@ModelAttribute("delivery") DeliveryData deliveryData) { this.deliveryService.addNewAddress(deliveryData);
//        System.out.println(deliveryData);
//        return "index2";
//
//    }





    @GetMapping({"/product_list"})
    public ModelAndView listAllProducts() {
        ModelAndView mav = new ModelAndView("products/list-products-page");
        mav.addObject("products", productsRepository.findAll());
        return mav;
    }

    @GetMapping("/delivery")
    public ModelAndView addDeliveryForm() {
        ModelAndView mav = new ModelAndView("delivery/save-delivery-page");
        DeliveryData newDelivery = new DeliveryData();
        mav.addObject("delivery", newDelivery);
        return mav;
    }

    @PostMapping("/saveDelivery")
    public String saveDelivery(@ModelAttribute DeliveryData delivery) {
        deliveryRepository.save(delivery);
        return "product_info";
    }


    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long id) {
        ModelAndView mav = new ModelAndView("products/save-products-page");
        DeliveryData delivery = deliveryRepository.findById(id).get();
        mav.addObject("delivery", delivery);
        return mav;
    }

    @GetMapping("/deleteDelivery")
    public String deleteDelivery(@RequestParam Long id) {
        deliveryRepository.deleteById(id);
        return "redirect:/list";
    }


}
