package org.example;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock(
                "$",
                "Bitcoin",
                5000.00,
                100000.00
        );

        stock.getChangePercent(5000,100000);
    }
}
