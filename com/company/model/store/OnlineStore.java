package com.company.model.store;

import com.company.model.product.Buying;

public class OnlineStore extends Store {

    private String url;

    public OnlineStore(String name, Buying[] sales, String url) {
        super(name, sales);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
