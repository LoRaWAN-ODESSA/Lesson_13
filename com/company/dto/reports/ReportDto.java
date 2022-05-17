package com.company.dto.reports;

import com.company.dto.BuyingDto;

public class ReportDto {

    String name;
    private BuyingDto[] data;
    private double totalSum;

    public ReportDto(String name, BuyingDto[] data, double totalSum) {
        this.name = name;
        this.data = data;
        this.totalSum = totalSum;
    }

    public ReportDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BuyingDto[] getData() {
        return data;
    }

    public void setData(BuyingDto[] data) {
        this.data = data;
    }

    public double getTotalSum() {
        return totalSum;
    }
}
