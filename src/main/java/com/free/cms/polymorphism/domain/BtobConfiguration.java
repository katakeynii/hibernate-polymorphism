package com.free.cms.polymorphism.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("BTOB")
public class BtobConfiguration implements Configurable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public BtobConfiguration() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BtobConfiguration [id=" + id + "]";
    }

    
}