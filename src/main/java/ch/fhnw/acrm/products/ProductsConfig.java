//package ch.fhnw.acrm.products;
//
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.List;
//
//
//@Configuration
//public class ProductsConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(ProductsRepository repository){
//        return args -> {
//            Products a = new Products(
//                        "Aflower",
//                        40,
//                        2
//            );
//
//            Products b = new Products(
//                    "Bflower",
//                    20,
//                    2.4
//            );
//
//            Products c = new Products(
//                    "Cflower",
//                    9,
//                    1.7
//            );
//
//            Products d = new Products(
//                    "Dflower",
//                    84,
//                    3.8
//            );
//
//            //Save to database
//            repository.saveAll(
//                    List.of(a,b,c,d)
//            );
//
//        };
//
//
//    }
//}
