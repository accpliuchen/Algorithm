package com.interview.exercise.exercise359;

import java.util.HashMap;

public class Test {

    private HashMap<String,Integer> hashMap;

    public Test() {
        hashMap=new HashMap<String,Integer>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!this.hashMap.containsKey(message)){
            this.hashMap.put(message,timestamp);
            return true;
        }

        Integer oldTimestamp=this.hashMap.get(message);

        if(timestamp-oldTimestamp>=10){
            this.hashMap.put(message,timestamp);
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String args[]){
        Test logger = new Test();
        logger.shouldPrintMessage(1, "foo");  // return true, next allowed timestamp for "foo" is 1 + 10 = 11
        logger.shouldPrintMessage(2, "bar");  // return true, next allowed timestamp for "bar" is 2 + 10 = 12
        logger.shouldPrintMessage(3, "foo");  // 3 < 11, return false
        logger.shouldPrintMessage(8, "bar");  // 8 < 12, return false
        logger.shouldPrintMessage(10, "foo"); // 10 < 11, return false
        logger.shouldPrintMessage(11, "foo"); // 11 >= 11, return true, next allowed timestamp for "foo" is 11 + 10 = 21

    }
}
