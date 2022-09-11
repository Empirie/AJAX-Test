//package ch.fhnw.acrm.transportcosts;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TscCreator implements CommandLineRunner {
//
//    private final TransportCostsRepository transportCostsRepository;
//
//    public TscCreator(TransportCostsRepository transportCostsRepository) {
//        this.transportCostsRepository = transportCostsRepository;
//    }
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//
//        TransportCosts transportCosts1 = new TransportCosts(1L, 58.65, 87.00,
//                114.50,
//                137.10,
//                160.80,
//                181.65,
//                201.45,
//                220.30,
//                238.35,
//                255.35,
//                271.45,
//                286.55);
//        transportCostsRepository.save(transportCosts1);
//
//
//        TransportCosts transportCosts2 = new TransportCosts(2L,
//                67.00, 99.40, 130.85, 156.75, 183.80, 207.55, 230.25, 251.85, 272.40, 291.90, 310.25, 327.50);
//        transportCostsRepository.save(transportCosts2);
//
//        TransportCosts transportCosts3 = new TransportCosts(
//                3L,
//                75.40,
//                111.90,
//                147.15,
//                176.35,
//                206.65,
//                233.50,
//                259.00,
//                283.35,
//                306.45,
//                328.40,
//                348.95,
//                368.40);
//        transportCostsRepository.save(transportCosts3);
//
//        TransportCosts transportCosts4 = new TransportCosts(4L, 83.75, 124.30, 163.50, 195.90, 229.70, 259.45, 287.70, 314.85, 340.50, 364.75, 387.80, 409.40);
//        transportCostsRepository.save(transportCosts4);
//
//
//    }
//
//
//    }
//
//
//
//
//
