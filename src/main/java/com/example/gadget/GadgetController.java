package com.example.gadget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public List<Gadget> getGadgets(){

        return gadgetService.getGadget();
    }

    @GetMapping("{id}")
    public ResponseEntity<Gadget> getGadget(@PathVariable("id") Long  id) {

        return ResponseEntity.ok(gadgetService.getGadgetById(id));
    }


    @PostMapping
    public ResponseEntity<Gadget> registerNewGadget(@RequestBody Gadget gadget){

        gadgetService.addNewGadget(gadget);
        return ResponseEntity.status(HttpStatus.CREATED).body(gadget);

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

