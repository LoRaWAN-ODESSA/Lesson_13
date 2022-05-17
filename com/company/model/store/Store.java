package com.company.model.store;

import com.company.model.product.Buying;

public class Store {

    private String name;
    private Buying[] sales;

    public Store(String name, Buying[] sales) {
        this.name = name;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Buying[] getSales() {
        return sales;
    }

    public void setSales(Buying[] sales) {
        this.sales = sales;
    }
}
