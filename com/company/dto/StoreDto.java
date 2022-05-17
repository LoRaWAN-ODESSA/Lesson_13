package com.company.dto;

public class StoreDto {

    private String name;
    private BuyingDto[] sells;

    public StoreDto(String name, BuyingDto[] sells) {
        this.name = name;
        this.sells = sells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BuyingDto[] getSells() {
        return sells;
    }

    public void setSells(BuyingDto[] sells) {
        this.sells = sells;
    }
}
