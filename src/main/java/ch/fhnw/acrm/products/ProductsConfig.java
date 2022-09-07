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
//
//            //Ctrl + Alt + V -> Introduce variable
//            Products aflower = new Products(
//                    "Aflower",
//                    40,
//                    2
//            );
//
//            Products bflower = new Products(
//                    "Bflower",
//                    20,
//                    2.4
//            );
//
//            Products cflower = new Products(
//                    "Cflower",
//                    9,
//                    1.7
//            );
//
//            Products dflower = new Products(
//                    "Dflower",
//                    84,
//                    3.8
//            );
//
//            //Save to database
//            repository.saveAll(
//                    List.of(aflower, bflower)
//            );
//
//        };
//
//
//    }
//}
