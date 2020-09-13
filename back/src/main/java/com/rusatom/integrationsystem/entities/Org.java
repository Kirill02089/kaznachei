package com.rusatom.integrationsystem.entities;

import javax.persistence.*;

@Entity
@Table(name = "RA_ORGS")
public class Org {

    public enum Type {GO, FL}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String inn;
    @Column
    private String kpp;
    @Column
    private String name;

    @Enumerated(javax.persistence.EnumType.STRING)
    @Column
    private Type type;

    public Org(String inn, String kpp, String name, Type type) {
        this.inn = inn;
        this.kpp = kpp;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
