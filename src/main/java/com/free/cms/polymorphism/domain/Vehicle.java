package com.free.cms.polymorphism.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Column;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.*;

@Entity
class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private Integer year;
    @Any(
        metaColumn=@Column(name="owner_type" , length=3),
        fetch=FetchType.LAZY
     )
    //  @AnyDiscriminator(DiscriminatorType.STRING)
    //  @AnyDiscriminatorValue(discriminator = "S", entity = StringProperty.class)
    //  @AnyDiscriminatorValue(discriminator = "I", entity = IntegerProperty.class)
     @AnyMetaDef(
        idType="long", metaType="string" ,
        metaValues={
           @MetaValue(targetEntity=Person.class, value="PRS" ),
           @MetaValue(targetEntity=Company.class, value="CPY" )
        }
     )
     @JoinColumn(name="owner_id" )
    private VehicleOwner owner;


    public Vehicle() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public VehicleOwner getOwner() {
        return owner;
    }

    public void setOwner(VehicleOwner owner) {
        this.owner = owner;
    }
    
}