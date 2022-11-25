package com.free.cms.polymorphism.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.*;


import org.hibernate.annotations.Any;
import org.hibernate.annotations.*;

@Entity
public class Configuration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Any(
        metaColumn = @Column( name = "configurable_type" ),
        fetch=FetchType.LAZY
    )
    @AnyMetaDef(
        idType = "long", metaType = "string",
        metaValues = {
            @MetaValue( targetEntity = UmeConfiguration.class, value="TOUTUME" ),
            @MetaValue( targetEntity = BtobConfiguration.class, value="BTOB" ),
            @MetaValue( targetEntity = BackMarginConfiguration.class, value="BACKMARGIN" ) 
        }
    )
    @JoinColumn(name="configurable_id" )
    private Configurable configurable;

    public Configuration () {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Configurable getConfigurable() {
        return configurable;
    }

    public void setConfigurable(Configurable configurable) {
        this.configurable = configurable;
    }

    
}