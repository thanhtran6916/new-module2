package jame.product_management;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String productionKan;
    private int cost;
    private String other;

    public Product(int id, String name, String productionKan, int cost, String other) {
        this.id = id;
        this.name = name;
        this.productionKan = productionKan;
        this.cost = cost;
        this.other = other;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionKan() {
        return productionKan;
    }

    public void setProductionKan(String productionKan) {
        this.productionKan = productionKan;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + productionKan + "," + cost + "," + other;
    }
}
