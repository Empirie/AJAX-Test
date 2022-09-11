package ch.fhnw.acrm.deliverydata;


import ch.fhnw.acrm.data.domain.Agent;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch.fhnw.acrm.business.service.AgentService;
import java.util.List;

@Service
public class DeliveryService {


    private AgentService agentService;
    private final DeliveryRepository deliveryRepository;

    @Autowired
    public DeliveryService(AgentService agentService, DeliveryRepository deliveryRepository) {
        this.agentService = agentService;
        this.deliveryRepository = deliveryRepository;
    }


  public List<DeliveryData> getDeliveryData(){
        return deliveryRepository.findAll();
    }


    public String getGodString(){
        Agent agent = agentService.getCurrentAgent();

        List<DeliveryData> allDeliveryData = deliveryRepository.findAll();

        DeliveryData deliveryData = new DeliveryData();
        for (DeliveryData dd : allDeliveryData){
         if(  dd.getAgent().getId() == agent.getId()){
             deliveryData = dd;
         }
        }
//        System.out.println(deliveryData.toString());
//

//        int nr = deliveryRepository.getById(agentService.getCurrentAgent().getId()).getStreetnumber();
//
//        int po = deliveryRepository.getById(agentService.getCurrentAgent().getId()).getPobox();
//        String city = deliveryRepository.getById(agentService.getCurrentAgent().getId()).getCityname();
//        String godstring = street + nr + po + city;
//        System.out.println(godstring);
        return deliveryData.toString();
    }

    public void addNewDeliveryData(DeliveryData deliveryData){
       deliveryRepository.save(deliveryData);
    }

    void save(DeliveryData deliveryData) {

    }



//    @RequestMapping(path = "/products/create")
//    public void addStreetName(DeliveryRepository deliveryRepository){
//        return;deliveryRepository.g
//    }





//    String street = deliveryRepository.getById(agentService.getCurrentAgent().getId()).getStreetname();
//    String nr = deliveryRepository.getById(agentService.getCurrentAgent().getId()).getStreetnumber();
//
//    int po = deliveryRepository.getById(agentService.getCurrentAgent().getId()).getPobox();
//    String city = deliveryRepository.getById(agentService.getCurrentAgent().getId()).getCityname();

}
