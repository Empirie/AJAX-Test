package ch.fhnw.acrm.transportcosts;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportCostsService {

    private final TransportCostsRepository transportCostsRepository;


    @Autowired
    public TransportCostsService(TransportCostsRepository transportCostsRepository) {
        this.transportCostsRepository = transportCostsRepository;

    }

    public List<TransportCosts> getTransportCosts(){
        return transportCostsRepository.findAll();
    }

//    public void addNewTransportCostListToDB(TransportCosts transportCosts){
//        transportCostsRepository.save(transportCosts);
//    }

}
