package ch.fhnw.acrm.deliverydata;


import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.data.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/delivery")
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


    @GetMapping("/pricing")
    public String getDeliveryData(Model model) {
        model.addAttribute("distance",
                deliveryRepository.getById(1L).getStreetname()+
                deliveryRepository.getById(1L).getStreetnumber()+
                deliveryRepository.getById(1L).getPobox()+
                deliveryRepository.getById(1L).getCityname());

        return "distance";
    }


    @PostMapping(path = "/address")
    public void addDeliveryAddress(@RequestBody DeliveryData deliveryData) { this.deliveryService.addNewAddress(deliveryData);}






}
