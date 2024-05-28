package com.example.gadget;



import jakarta.persistence.*;

import java.time.LocalDate;

@Entity //Hibernate
@Table //table in my db
public class Gadget {
    @Id
    @SequenceGenerator(
            name = "gadget_sequence",
            sequenceName = "gadget_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "gadget_sequence"
    )

    private Long id;
    private String name;
    private String manufacturer;
    private String description;
    private String serialNumber;
    private String model;
    private double price;
    private LocalDate purchaseDate;
    private Integer age;

    public Gadget() {
    }

    public Gadget(Long id, String name, String manufacturer,
                  String description, String serialNumber,
                  String model, double price, LocalDate purchaseDate,
                  Integer age) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.description = description;
        this.serialNumber = serialNumber;
        this.model = model;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.age = age;
    }

    public Gadget(String name, String manufacturer,
                  String description, String serialNumber,
                  String model, double price,
                  LocalDate purchaseDate, Integer age) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.description = description;
        this.serialNumber = serialNumber;
        this.model = model;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.age = age;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", purchaseDate=" + purchaseDate +
                ", age=" + age +
                '}';
    }
}
