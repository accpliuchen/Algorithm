package com.interview.wealthfront;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    public double cash;
    public List<Position> positions;


    public Portfolio(double cash, List<Position> positions) {
        this.cash = cash;
        this.positions = new ArrayList<>(positions);
    }

    /*
    If the buy is viable (sufficient cash), executes it and returns true,
    else returns false
    */
    public boolean buy(Stock stock, int quantity, double price) {



//        double total = price * quantity;
//
//        if (cash >= total)
//        {
//            cash -=total;
//            positions.add(new Stock(stock.tickerSymbol), quantity);
//            return true;
//
//        }
        return false;

    }


}
