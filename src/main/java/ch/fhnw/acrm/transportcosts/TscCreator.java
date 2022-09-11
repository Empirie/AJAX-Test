package ch.fhnw.acrm.transportcosts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TscCreator implements CommandLineRunner {

    private final TransportCostsRepository transportCostsRepository;

    public TscCreator(TransportCostsRepository transportCostsRepository) {
        this.transportCostsRepository = transportCostsRepository;
    }


    @Override
    public void run(String... args) throws Exception {


        TransportCosts transportCosts3 = new TransportCosts(
                3L,
                75.40,
                111.90,
                147.15,
                176.35,
                206.65,
                233.50,
                259.00,
                283.35,
                306.45,
                328.40,
                348.95,
                368.40);
        transportCostsRepository.save(transportCosts3);



    }




}
