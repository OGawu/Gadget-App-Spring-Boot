package com.example.gadget;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GadgetRepository
        extends JpaRepository<Gadget, Long> {
    @Query("SELECT b FROM Gadget b WHERE b.serialNumber=?1")
    Optional<Gadget> findBySerialNumber(String serialNumber);

}
