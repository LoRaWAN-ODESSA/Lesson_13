package com.company.dto.reports;

import com.company.dto.BuyingDto;

public class ReportDtoAmount {
    private String name;
    private BuyingDto[] data;

    public ReportDtoAmount(String name, BuyingDto[] data) {
        this.name = name;
        this.data = data;
    }

    public ReportDtoAmount() {
        //EMPTY
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
}
