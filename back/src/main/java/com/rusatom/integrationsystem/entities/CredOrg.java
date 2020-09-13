package com.rusatom.integrationsystem.entities;

import javax.persistence.*;

@Entity
@Table(name = "RA_CRED_ORG")
public class CredOrg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String bic;
    @Column
    private String name;

    public CredOrg(String bic, String name) {
        this.bic = bic;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
