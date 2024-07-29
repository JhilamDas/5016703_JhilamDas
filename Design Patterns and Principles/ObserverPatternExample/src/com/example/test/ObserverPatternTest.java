package com.example.test;

import com.example.stock.StockMarket;
import com.example.observer.MobileApp;
import com.example.observer.WebApp;

public class ObserverPatternTest {

    public static void main(String[] args) {
        // Create a stock market instance
        StockMarket stockMarket = new StockMarket();

        // Create observer instances
        MobileApp mobileApp = new MobileApp("Mobile App");
        WebApp webApp = new WebApp("Web App");

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Simulate stock price updates
        stockMarket.setStockPrice(100.00);
        stockMarket.setStockPrice(150.00);

        // Remove an observer and simulate another update
        stockMarket.removeObserver(webApp);
        stockMarket.setStockPrice(200.00);
    }
}
