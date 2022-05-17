package com.company.model.store;

import com.company.model.product.Buying;

public class OfflineStore extends Store {

    private String address;

    public OfflineStore(String name,  String address, Buying[] sales) {
        super(name, sales);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
