package com.interview.google.exercise1;

import java.util.HashMap;
import java.util.Map;

class Message {
    String content;
    int timestamp;

    public Message(String content, int timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }
}

public class Test {

    private static final int WINDOW_SIZE = 10; // 10 seconds

    public static Map<String, Message> messageMap;

    public Test() {
        this.messageMap = new HashMap<>();
    }


//    public void processMessage(String content, int timestamp) {
//        Message newMessage = new Message(content, timestamp);
//
//        // Remove messages older than 10 seconds
//
//        messageMap.entrySet().removeIf(entry -> timestamp - entry.getValue().timestamp > WINDOW_SIZE && entry.getKey().equals(content));
//
//        // Check if the message content has been seen in the last 10 seconds
//        //Message existingMessage = messageMap.get(content);
//
//        if (messageMap.containsKey(content)) {
//            messageMap.remove(content);
//        }else{
//            messageMap.put(content, newMessage);
//            //System.out.println(timestamp + " " + content);
//        }
//    }


    public void processMessage(String content, int timestamp) {
        Message newMessage = new Message(content, timestamp);

        // Remove messages older than 10 seconds
        messageMap.entrySet().removeIf(entry -> timestamp - entry.getValue().timestamp > WINDOW_SIZE);

        // Check if the message content has been seen in the last 10 seconds
        Message existingMessage = messageMap.get(content);

        if (existingMessage == null) {
            messageMap.put(content, newMessage);
            System.out.println(timestamp + " " + content);
        }
    }

    public static void main(String[] args) {
        Test messageFilter = new Test();

        // Example Messages Received
        messageFilter.processMessage("solar panel activated", 10);
        messageFilter.processMessage("low battery warning", 11);
        messageFilter.processMessage("tire one: low air pressure", 12);
        messageFilter.processMessage("solar panel activated", 13);
        messageFilter.processMessage("low battery warning", 14);
        messageFilter.processMessage("solar panel activated", 21);
        messageFilter.processMessage("solar panel activated", 35);

//        messageMap.entrySet().stream()
//                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue().timestamp));
    }
}
