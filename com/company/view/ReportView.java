package com.company.view;

import com.company.dto.BuyingDto;
import com.company.dto.reports.ReportDto;
import com.company.dto.reports.ReportDtoAmount;

public class ReportView {

    public static final String DESCRIPTION = "REPORT DATA: ";

    public void printDetails(ReportDto report) {
        int totalDash = 50;
        int firstDashLength = 25;
        int secondDashLength = 10;
        System.out.println("=".repeat(totalDash));
        System.out.println(DESCRIPTION + report.getName());
        System.out.println("=".repeat(totalDash));

        System.out.println("Name" + (" ".repeat(firstDashLength - "Name".length())) + "Count" +
                (" ".repeat(secondDashLength - "Count".length())) + "Sum");
        System.out.println("=".repeat(totalDash));
        for (BuyingDto buyingDto : report.getData()) {
            String cost = Math.round(buyingDto.getSum()) + " uah";
            System.out.println(buyingDto.getName() + (" ".repeat(firstDashLength - buyingDto.getName().length())) +
                    buyingDto.getCount() + (" ".repeat(secondDashLength - String.valueOf(buyingDto.getCount()).length())) + cost);
            System.out.println("-".repeat(totalDash));
        }
        System.out.println("=".repeat(totalDash));
        System.out.println("Total sum: " + report.getTotalSum() + " uah");
    }

    public void printTop5(ReportDtoAmount report) {
        int totalDash = 40;
        int numDash = 5;
        int firstDashLength = 25;
        System.out.println("=".repeat(totalDash));
        System.out.println(DESCRIPTION + report.getName());
        System.out.println("=".repeat(totalDash));

        Integer num = 1;
        System.out.println("Num" + (" ".repeat(2)) + "Name" + (" ".repeat(firstDashLength - "Name".length())) + "Count");
        System.out.println("=".repeat(totalDash));

        for (BuyingDto buyingDto : report.getData()) {
            System.out.println(num + "." + (" ".repeat(numDash - num.toString().length() - 1)) + buyingDto.getName() +
                    (" ".repeat(firstDashLength - buyingDto.getName().length())) + buyingDto.getCount());
            System.out.println("-".repeat(totalDash));
            num++;
        }
        System.out.println("=".repeat(totalDash));
    }

}
