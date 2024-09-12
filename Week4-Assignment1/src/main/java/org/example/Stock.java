package org.example;

public class Stock {
    String stockSymbol;
    String stockName;
    double previousClosingPrice;
    double currentStockPrice;

    public Stock(String symbol, String name, double previousPrice, double currentPrice) {
        stockSymbol = symbol;
        stockName = name;
        previousClosingPrice = previousPrice;
        currentStockPrice = currentPrice;
    }

    public void getChangePercent(double previousClosingPrice, double currentStockPrice) {
        double getChangePercent = (currentStockPrice - previousClosingPrice) * 100;
        System.out.println("The percentage is: " + getChangePercent);
    }


}


