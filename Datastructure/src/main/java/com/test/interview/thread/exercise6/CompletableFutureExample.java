package com.test.interview.thread.exercise6;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {
        // 第一个异步任务：计算整数的平方
        CompletableFuture<Integer> squareFuture = CompletableFuture.supplyAsync(() -> {
            int number = 5; // 要计算的整数
            int square = number * number;
            System.out.println("1计算平方完成");
            return square;
        });

        // 第二个异步任务：计算整数的立方
        CompletableFuture<Integer> cubeFuture = CompletableFuture.supplyAsync(() -> {
            int number = 5; // 要计算的整数
            int cube = number * number * number;
            System.out.println("2计算立方完成");
            return cube;
        });

        // 合并结果并构造最终字符串
        CompletableFuture<String> combinedFuture = squareFuture.thenCombine(cubeFuture, (square1, cube1) -> {
            String result = "Sum: " + square1 + " + " + cube1;
            return result;
        });

        // 等待异步任务完成并获取最终结果
        try {
            String finalResult = combinedFuture.get();
            System.out.println(finalResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
