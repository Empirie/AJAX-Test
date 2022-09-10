package ch.fhnw.acrm.deliverydata;


import ch.fhnw.acrm.products.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    @Autowired
    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }


  public List<DeliveryData> getDeliveryData(){
        return deliveryRepository.findAll();
    }

    public void addNewDeliveryData(DeliveryData deliveryData){
       deliveryRepository.save(deliveryData);
    }

    void save(DeliveryData deliveryData) {

    }

    public String


//    @RequestMapping(path = "/products/create")
//    public void addStreetName(DeliveryRepository deliveryRepository){
//        return;deliveryRepository.g
//    }



}
