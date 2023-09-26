package com.interview.exercise.exercise207;

import java.util.*;

public class QuantitativeTrading {
//    public static List<Integer> getGrossProfit(List<String> events) {
//            List<Integer> result = new ArrayList<>();
//            Map<String, Integer> portfolio = new HashMap<>();
//            int grossProfit = 0;
//
//            for (String event : events) {
//                String[] tokens = event.split(" ");
//
//                if (tokens[0].equals("BUY")) {
//                    String stock = tokens[1];
//                    int quantity = Integer.parseInt(tokens[2]);
//                    portfolio.put(stock, portfolio.getOrDefault(stock, 0) + quantity);
//                } else if (tokens[0].equals("SELL")) {
//                    String stock = tokens[1];
//                    int quantity = Integer.parseInt(tokens[2]);
//                    if (portfolio.containsKey(stock)) {
//                        int currentQuantity = portfolio.get(stock);
//                        if (currentQuantity >= quantity) {
//                            portfolio.put(stock, currentQuantity - quantity);
//                            grossProfit += quantity * currentQuantity;
//                        }
//                    }
//                } else if (tokens[0].equals("CHANGE")) {
//                    String stock = tokens[1];
//                    int priceChange = Integer.parseInt(tokens[2]);
//                    if (portfolio.containsKey(stock)) {
//                        int currentQuantity = portfolio.get(stock);
//                        grossProfit -= priceChange * currentQuantity;
//                    }
//                } else if (tokens[0].equals("QUERY")) {
//                    result.add(grossProfit);
//                }
//            }
//
//            return result;
//    }


//    public static List<Integer> getGrossProfit(String[] events) {
//        List<Integer> result = new ArrayList<>();
//        Map<String, Integer> portfolio = new HashMap<>();
//        int grossProfit = 0;
//
//        for (String event : events) {
//            String[] tokens = event.split(" ");
//
//            if (tokens[0].equals("BUY")) {
//                String stock = tokens[1];
//                int quantity = Integer.parseInt(tokens[2]);
//                portfolio.put(stock, portfolio.getOrDefault(stock, 0) + quantity);
//            } else if (tokens[0].equals("SELL")) {
//                String stock = tokens[1];
//                int quantity = Integer.parseInt(tokens[2]);
//                if (portfolio.containsKey(stock)) {
//                    int currentQuantity = portfolio.get(stock);
//                    if (currentQuantity >= quantity) {
//                        portfolio.put(stock, currentQuantity - quantity);
//                        grossProfit += quantity * currentQuantity;
//                    }
//                }
//            } else if (tokens[0].equals("CHANGE")) {
//                String stock = tokens[1];
//                int priceChange = Integer.parseInt(tokens[2]);
//                if (portfolio.containsKey(stock)) {
//                    int currentQuantity = portfolio.get(stock);
//                    grossProfit -= priceChange * currentQuantity;
//                }
//            } else if (tokens[0].equals("QUERY")) {
//                result.add(Math.abs(grossProfit));
//            }
//        }
//
//        return result;
//    }

    public static List<Integer> getGrossProfit(String[] events) {
        Map<String, Integer> stocks = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int grossProfit = 0;

        for (String event : events) {
            String[] tokens = event.split(" ");
            String action = tokens[0];

            String stock="";

            if(tokens.length>1)
                 stock= tokens[1];

            if (action.equals("BUY")) {
                int quantity = Integer.parseInt(tokens[2]);
                stocks.put(stock, stocks.getOrDefault(stock, 0) + quantity);
            } else if (action.equals("SELL")) {
                int quantity = Integer.parseInt(tokens[2]);
                int cost = stocks.get(stock);
                stocks.put(stock, cost - quantity);
                grossProfit += (Integer.parseInt(tokens[2]) - cost);
            } else if (action.equals("CHANGE")) {
                int price = Integer.parseInt(tokens[2]);
                int cost = stocks.get(stock);
                grossProfit += (price - cost) * stocks.get(stock);
                stocks.put(stock, price);
            } else if (action.equals("QUERY")) {
                result.add(grossProfit);
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        List<String> events_1 = Arrays.asList(
//                "BUY googl 20",
//                "BUY aapl 50",
//                "CHANGE googl 6",
//                "QUERY",
//                "SELL aapl 10",
//                "CHANGE aapl -2",
//                "QUERY"
//        );


        String[] events_1 = {
                "BUY googl 20",
                "BUY aapl 50",
                "CHANGE googl 6",
                "QUERY",
                "SELL aapl 10",
                "CHANGE aapl -2",
                "QUERY"
        };

        List<Integer> result_1 = getGrossProfit(events_1);
        System.out.println(result_1); // Output: [120, 40]
    }
}


