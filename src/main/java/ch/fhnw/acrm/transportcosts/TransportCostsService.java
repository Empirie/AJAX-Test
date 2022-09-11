package ch.fhnw.acrm.transportcosts;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportCostsService {

    private final TransportCostsRepository transportCostsRepository;
    private final TransportCostsService transportCostsService;

    @Autowired
    public TransportCostsService(TransportCostsRepository transportCostsRepository, TransportCostsService transportCostsService) {
        this.transportCostsRepository = transportCostsRepository;
        this.transportCostsService = transportCostsService;
    }


    public void addNewTransportCostListToDB(TransportCosts transportCosts){
        transportCostsRepository.save(transportCosts);
    }

}
