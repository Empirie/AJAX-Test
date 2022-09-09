package ch.fhnw.acrm.deliverydata;


import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.data.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
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


    @GetMapping
    public String getDeliveryData(Model model) {
        model.addAttribute("distance", agentService.getCurrentAgent().
    }









}
