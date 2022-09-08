package ch.fhnw.acrm.products;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class ProductBootstrap implements CommandLineRunner {

    private final ProductsRepository productsRepository;


    public ProductBootstrap(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Products aflower = new Products(
                    "Aflower",
                    40,
                    2
            );

                    Products bflower = new Products(
                    "Bflower",
                    20,
                    2.4
            );

            Products cflower = new Products(
                    "Cflower",
                    9,
                    1.7
            );

            Products dflower = new Products(
                    "Dflower",
                    84,
                    3.8
            );

        //save to repo test

//        productsRepository.save(aflower);
//        productsRepository.save(bflower);
//        productsRepository.save(cflower);
//        productsRepository.save(dflower);
        System.out.println("cflower & dflower should be added to db");
        System.out.println("Number of products" + productsRepository.count());
    }
}
