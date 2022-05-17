package com.company.controller;

import com.company.dto.reports.ReportDto;
import com.company.dto.reports.ReportDtoAmount;
import com.company.model.store.Store;
import com.company.service.ReportService;
import com.company.view.ReportView;

public class ReportController { // API

    public void execute(Store[] stores) {
        ReportService reportService = new ReportService();
        ReportDto report = reportService.build(stores);
        ReportView view = new ReportView();
        view.printDetails(report);
    }

    public void executeTopSales(Store[] stores) {
        ReportService reportService = new ReportService();
        ReportDtoAmount report = reportService.buildTop(stores);
        ReportView view = new ReportView();
        view.printTop5(report);
    }

}
