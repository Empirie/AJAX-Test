package ch.fhnw.acrm.deliverydata;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    @Autowired
    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public void addNewAddress(DeliveryData deliveryData){
        deliveryRepository.save(deliveryData);
    }



    public List<DeliveryData> getDeliveryData() {
        return deliveryRepository.findAll();
    }



}
