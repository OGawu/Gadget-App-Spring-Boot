package com.example.gadget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(path = "api/v1/gadget")
public class GadgetController {
    private final GadgetService gadgetService;

    @Autowired
    public GadgetController(GadgetService gadgetService) {
        this.gadgetService = gadgetService;
    }

    @GetMapping
    public List<Gadget> getGadget(){
        return gadgetService.getGadget();

    }



}

