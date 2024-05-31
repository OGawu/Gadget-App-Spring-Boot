package com.example.gadget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void registerNewGadget(@RequestBody Gadget gadget){
        gadgetService.addNewGadget(gadget);

    }

    @DeleteMapping(path = "{gadgetId}")
    public void deleteGadget(@PathVariable("gadgetId") Long gadgetId){
        gadgetService.deleteGadget(gadgetId);
    }

    @PutMapping(path = "{gadgetId}")
    public void updateGadget(
            @PathVariable("gadgetId") Long gadgetId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String serialNumber){
        gadgetService.updateGadget(gadgetId, name, serialNumber);
    }



}

