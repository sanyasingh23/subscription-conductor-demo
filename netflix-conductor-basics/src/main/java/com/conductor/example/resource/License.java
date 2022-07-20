package com.conductor.example.resource;


public class License {
    private String productType;
    private String quantity;
    private String startDate;
    private String endDate;
    private String classification;
    private String licenseType;
    private String billingType;
    private String status;

    public License() {
    }

    public License(String productType, String quantity, String startDate, String endDate, String classification, String licenseType, String billingType, String status) {
        this.productType = productType;
        this.quantity = quantity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.classification = classification;
        this.licenseType = licenseType;
        this.billingType = billingType;
        this.status = status;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

