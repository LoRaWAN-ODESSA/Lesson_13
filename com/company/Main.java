package com.company;

import com.company.controller.ReportController;
import com.company.model.product.Buying;
import com.company.model.product.Product;
import com.company.model.store.OfflineStore;
import com.company.model.store.OnlineStore;
import com.company.model.store.Store;

public class Main {

    public static void main(String[] args) {

        ReportController controller = new ReportController();
        Store[] stores = generateMockStores();
        controller.execute(stores);
        System.out.println();
        controller.executeTopSales(stores);

    }

    private static Store[] generateMockStores() {
        Product pepsi = new Product("Pepsi", 27);
        Product morshynska = new Product("Morshynska", 18);
        Product eggs = new Product("Eggs", 30.60);
        Product baton = new Product("French baton", 22.8);

        Buying b1 = new Buying(pepsi, 200);
        Buying b2 = new Buying(morshynska, 210);
        Buying b3 = new Buying(eggs, 350);
        Buying b4 = new Buying(baton, 183);
        Buying[] atbBuyings = {b1, b2, b3, b4};
        OfflineStore atb = new OfflineStore("atb", "Kyiv, Mazepy 45", atbBuyings);


        Product cola = new Product("Coca cola", 20);
        Product redLabel = new Product("Red Label", 380);
        Product lays = new Product("Lays", 33);

        Buying bo1 = new Buying(cola, 350);
        Buying bo2 = new Buying(redLabel, 60);
        Buying bo3 = new Buying(lays, 133);
        Buying[] atbBuyingsOnline = {bo1, bo2, bo3};
        OnlineStore atbOnline = new OnlineStore("atb",atbBuyingsOnline, "https://atb.ua/shop");

        Store[] stores = {atb, atbOnline};
        return stores;
    }
}
