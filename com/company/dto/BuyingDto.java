package com.company.dto;

public class BuyingDto {

    private String name;
    private int count;
    private double sum;

    public BuyingDto(String name, int count, double sum) {
        this.name = name;
        this.count = count;
        this.sum = sum;
    }

    public BuyingDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
