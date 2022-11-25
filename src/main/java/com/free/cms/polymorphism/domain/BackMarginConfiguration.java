package com.free.cms.polymorphism.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("BACKMARGIN")
public class BackMarginConfiguration implements Configurable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Integer ky1Commission;
    private Integer ky2Commission;
    private Integer penObjectif;

    public BackMarginConfiguration() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getKy1Commission() {
        return ky1Commission;
    }

    public void setKy1Commission(Integer ky1Commission) {
        this.ky1Commission = ky1Commission;
    }

    public Integer getKy2Commission() {
        return ky2Commission;
    }

    public void setKy2Commission(Integer ky2Commission) {
        this.ky2Commission = ky2Commission;
    }

    public Integer getPenObjectif() {
        return penObjectif;
    }

    public void setPenObjectif(Integer penObjectif) {
        this.penObjectif = penObjectif;
    }

    @Override
    public String toString() {
        return "BackMarginConfiguration [id=" + id + ", ky1Commission=" + ky1Commission + ", ky2Commission="
                + ky2Commission + ", penObjectif=" + penObjectif + "]";
    }

    
}