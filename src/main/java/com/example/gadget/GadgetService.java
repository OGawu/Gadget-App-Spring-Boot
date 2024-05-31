package com.example.gadget;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class GadgetService {
    private final GadgetRepository gadgetRepository;

    @Autowired
    public GadgetService(GadgetRepository gadgetRepository) {
        this.gadgetRepository = gadgetRepository;
    }

    public List<Gadget> getGadget(){
        return gadgetRepository.findAll();

    }

//    public Gadget getGadgetById(Long id){
//        return gadgetRepository.findById(id).orElse(null);
//    }

    public void addNewGadget(Gadget gadget) {
        Optional<Gadget> gadgetBySerialNumber = gadgetRepository.findBySerialNumber(gadget.getSerialNumber());
        if (gadgetBySerialNumber.isPresent()) {
            throw new IllegalStateException("Gadget with serial number " + gadget.getSerialNumber() + " already exists");

        }
        gadgetRepository.save(gadget);
    }

    public void deleteGadget(Long gadgetId) {
        boolean exists = gadgetRepository.existsById(gadgetId);
        if (!exists) {
            throw new IllegalStateException("Gadget with id number " + gadgetId + " does not exist");
        }
        gadgetRepository.deleteById(gadgetId);

    }
//    public void findById(Long gadgetId) {
//        Optional<Gadget> gadget = gadgetRepository.findById(gadgetId);
//    }

    @Transactional
    public void updateGadget(Long gadgetId,
                             String name,
                             String serialNumber) {
        Gadget gadget = gadgetRepository.findById(gadgetId).orElseThrow(() -> new IllegalStateException("Gadget with id " + gadgetId + " does not exist"));
        if (name!=null && name.length() > 0 && !Objects.equals(gadget.getName(), name)) {
            gadget.setName(name);
        }
        if (serialNumber!= null && serialNumber.length() > 0 &&
                !Objects.equals(gadget.getSerialNumber(), serialNumber)) {
            Optional<Gadget> gadgetOptional = gadgetRepository.findBySerialNumber(serialNumber);
            if (gadgetOptional.isPresent()) {
                throw new IllegalStateException("Gadget with serial number " + gadget.getSerialNumber() + " already exists");
            }
            gadget.setSerialNumber(serialNumber);
            

        }

    }

    public Gadget getGadgetById(Long id) {

        return gadgetRepository.findById(id).orElse(null);
    }
}
