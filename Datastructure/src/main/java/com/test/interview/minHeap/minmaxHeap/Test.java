package com.test.interview.minHeap.minmaxHeap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode.com/discuss/interview-question/1385903/Coinbase-Text-books-buying-and-selling-offers-problem/1037832
public class Test {

    public List<Integer> bestMatch(int[] buyOffers, int[] sellOffers, int buyPrice, int sellPrice) {
        PriorityQueue<Integer> buy = new PriorityQueue<Integer>((a, b) -> b-a);
        PriorityQueue<Integer> sell = new PriorityQueue<Integer>((a,b) -> a-b);

        int optimumSell = 0;
        int optimumBuy = 0;

        for(int b: buyOffers) {
            buy.add(b);
        }
        for(int s: sellOffers) {
            sell.add(s);
        }
        if(buy.peek() < sellPrice) {
            sell.add(sellPrice);
        } else {
            optimumBuy = buy.poll();
        }

        if(buyPrice < sell.peek()) {
            buy.add(buyPrice);
        } else {
            optimumSell = sell.poll();
        }
        List<Integer> res = new ArrayList<>();
        res.add(optimumBuy);
        res.add(optimumSell);
        return res;

    }

    public static void main(String[] args) {
        int[][] orders={{},{}};

        int[] buy = new int[]{100,100,90,96,98};
        int[] sell = new int[]{109,70,160,120,90};

        Test test=new Test();
        List<Integer> result=test.bestMatch(buy,sell,200,90);

        System.out.println("OptimumBuy:"+result.get(0).toString());
        System.out.println("OptimumSell:"+result.get(1).toString());
    }
}
