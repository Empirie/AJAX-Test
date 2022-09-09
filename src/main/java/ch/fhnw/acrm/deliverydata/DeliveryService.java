package ch.fhnw.acrm.deliverydata;


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

    @RequestMapping
    public void addNewAddress(DeliveryData deliveryData){
        deliveryRepository.save(deliveryData);
    }



    public List<DeliveryData> getDeliveryData() {
        return deliveryRepository.findAll();
    }

//    @RequestMapping(path = "/products/create")
//    public void addStreetName(DeliveryRepository deliveryRepository){
//        return;deliveryRepository.g
//    }



}
