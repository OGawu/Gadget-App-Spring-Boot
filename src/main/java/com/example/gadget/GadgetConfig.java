package com.example.gadget;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Locale;

import static java.time.Month.*;
@RestController
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
            Gadget VisionPro = new Gadget(
                    "Vision Pro",
                    "Apple",
                    "Space Black",
                    "DBCG234RSG",
                    "2WTUD/A",
                    1234.98,
                    LocalDate.of(2023,JUNE,16)
            );
            Gadget Desktop = new Gadget(
                    "Desktop 1",
                    "Dell Laptops",
                    "Silver, 14 inch",
                    "asdfghjklh",
                    "qwer",
                    1234.44,
                    LocalDate.of(2023,NOVEMBER,16)

            );

            repository.saveAll(
                    List.of(iPhone, MacBook,VisionPro, Desktop));



        };
    }

}
