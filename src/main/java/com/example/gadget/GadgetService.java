package com.example.gadget;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class GadgetService {
    public List<Gadget> getGadget(){
        return List.of(
                new Gadget(
                        1L,
                        "Iphone 15 Pro Max",
                        "Apple",
                        "Silver, 512gb",
                        "DNPTPSY7HFWR",
                        "MNOW2AB/A",
                        1459.99,
                        LocalDate.of(2023, Month.NOVEMBER,30),
                        1





                )
        );
    }
}
