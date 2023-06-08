package com.example.demo;

public class product {
    private String name;
    private String description;
    private String price;
    private String uom;
private String id;

    public product(String id,String name, String description, String price, String uom) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.uom = uom;
        this.id =id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getUom() {
        return uom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
}
