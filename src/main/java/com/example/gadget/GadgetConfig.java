package com.example.gadget;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class GadgetConfig {

    @Bean
    CommandLineRunner commandLineRunner(GadgetRepository repository){
        return args -> {
           Gadget iPhone = new Gadget(
                    "Iphone 15 Pro Max",
                    "Apple",
                    "Silver, 512gb",
                    "DNPTPSY7HFWR",
                    "MNOW2AB/A",
                    1459.99,
                    LocalDate.of(2010,NOVEMBER,30)

            );
            Gadget MacBook = new Gadget(
                    "Macbook Pro-M3",
                    "Apple",
                    "Space Gray, 1TB SSD",
                    "DNPTPWB7HFWR",
                    "MNOW2SX/A",
                    1799.00,
                    LocalDate.of(2021,FEBRUARY,14)

            );
            repository.saveAll(



        };
    }

}
