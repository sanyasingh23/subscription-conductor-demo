package com.conductor.example.resource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Subscription {
    private String customerName;
    @Id
    private String sid;
    private String eaId;
    private String status;
    private String region;
    private String country;

    public Subscription() {
    }

    public Subscription(String customerName, String sid, String eaId, String status, String region, String country) {
        this.customerName = customerName;
        this.sid = sid;
        this.eaId = eaId;
        this.status = status;
        this.region = region;
        this.country = country;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

//    public String getSid() {
//        return sid;
//    }
//
//    public void setSid(String sid) {
//        this.sid = sid;
//    }

    public String getEaId() {
        return eaId;
    }

    public void setEaId(String eaId) {
        this.eaId = eaId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
