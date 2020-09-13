package com.rusatom.integrationsystem.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RA_FINANCIAL_TRANSACTIONS")
public class FinancialTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String contractType;
    @Column
    private Date contractDate;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
    @Column
    private Double percentRate;
    @Column
    private String currency;

    public FinancialTransaction(String contractType, Date contractDate, Date startDate, Date endDate, Double percentRate, String currency) {
        this.contractType = contractType;
        this.contractDate = contractDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.percentRate = percentRate;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getPercentRate() {
        return percentRate;
    }

    public void setPercentRate(Double percentRate) {
        this.percentRate = percentRate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
