package com.company.service;

import com.company.dto.BuyingDto;
import com.company.dto.reports.ReportDto;
import com.company.dto.StoreDto;
import com.company.dto.reports.ReportDtoAmount;
import com.company.model.product.Buying;
import com.company.model.store.Store;

import java.util.ArrayList;
import java.util.List;

public class ReportService {

    public ReportDto build(Store[] stores) {
        StoreDto[] storeDtos = mapStores(stores);
        BuyingDto[] buyingDtos = mergeBuyings(storeDtos);

        double totalSum = 0;
        for (BuyingDto buyingDto : buyingDtos) {
            totalSum+= buyingDto.getSum();
        }
        return new ReportDto("Total money", buyingDtos, totalSum);
    }

    public ReportDtoAmount buildTop(Store[] stores) {
        StoreDto[] storeDtos = mapStores(stores);
        BuyingDto[] buyingDtos = mergeBuyings(storeDtos);
        BuyingDto[] buyingDtosTop = new BuyingDto[5];
        List<Integer> arrayTopIndex = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int temp = 0;
            BuyingDto newBuyingDto = new BuyingDto();
            for (int j = 0; j < buyingDtos.length; j++) {
                if(newBuyingDto.getCount() < buyingDtos[j].getCount() && i == 0) {
                    newBuyingDto = buyingDtos[j];
                    temp = j;
                } else if(newBuyingDto.getCount() < buyingDtos[j].getCount() && i != 0) {
                    if(arrayTopIndex.contains(j)) {
                        continue;
                    } else {
                        newBuyingDto = buyingDtos[j];
                        temp = j;
                    }
                }
            }
            buyingDtosTop[i] = newBuyingDto;
            arrayTopIndex.add(temp);
        }

        return new ReportDtoAmount("TOP 5 by amount", buyingDtosTop);
    }

    private BuyingDto[] mergeBuyings(StoreDto[] storeDtos) {
        int count = getCount(storeDtos);
        BuyingDto[] totalArr = new BuyingDto[count];
        int i = 0;
        for (StoreDto storeDto : storeDtos) {
            for (BuyingDto sell : storeDto.getSells()) {
                totalArr[i++] = sell;
            }
        }
        return totalArr;
    }

    private int getCount(StoreDto[] storeDtos) {
        int count = 0;
        for (StoreDto storeDto : storeDtos) {
            count += storeDto.getSells().length;
        }
        return count;
    }

    private StoreDto[] mapStores(Store[] stores) {
        StoreDto[] array = new StoreDto[stores.length];
        for (int i = 0; i < array.length; i++) {
            Store store = stores[i];
            String name = store.getName();
            BuyingDto[] buyingDtos = new BuyingDto[store.getSales().length];
            for (int j = 0; j < store.getSales().length; j++) {
                Buying sale = store.getSales()[j];
                double sum = sale.getProduct().getPrice() * sale.getCount();
                buyingDtos[j] = new BuyingDto(sale.getProduct().getName(), sale.getCount(), sum);
            }
            array[i]= new StoreDto(name, buyingDtos);
        }
        return array;
    }
}
