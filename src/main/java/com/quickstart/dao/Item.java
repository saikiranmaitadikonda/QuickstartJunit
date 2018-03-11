package com.quickstart.dao;

public class Item {
    private String title;

    private Float   unitPrice;
    private Integer kCalPer100g;
    private String  description;

    public Item() {
    }

    public Item(final String title, final Float unitPrice, final Integer kCalPer100g, final String description) {
        this.title = title;
        this.unitPrice = unitPrice;
        this.kCalPer100g = kCalPer100g;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(final Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getkCalPer100g() {
        return kCalPer100g;
    }

    public void setkCalPer100g(final Integer kCalPer100g) {
        this.kCalPer100g = kCalPer100g;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

}
