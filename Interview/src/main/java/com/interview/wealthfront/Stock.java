package com.interview.wealthfront;

public class Stock {
    String symbol;                 // The stock's symbol
    String name;                   // The stock's name
    double previousClosingPrice;	 // The stock price for the previous day
    double currentPrice;				 // The stock price for the current time

    // Construct a stock with a specified symbol and name
    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    // Return the percentage changed from previousClosingPrice to currentPrice
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) /
                previousClosingPrice) * 100;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double newCurrentPrice) {
        currentPrice = newCurrentPrice;
    }

    public void setPreviousClosingPrice(double newPreviousClosingPrice) {
        previousClosingPrice = newPreviousClosingPrice;
    }

}
