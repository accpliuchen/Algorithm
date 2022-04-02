package com.interview.databricks;

import java.util.*;

public class Test {

    public static void main(String args[]){
//eventId, startTime, recurringInterval
        int[] event1 = {1,0,5};
        int[] event2 = {2,7,3};
        int[][] events = {event1,event2};

        //type, timestamp, eventId
        String[] command1 = {"subscribe","0","1"};
        String[] command2 = {"unsubscribe","15","1"};
        String[] command3 = {"subscribe","4","2"};
        String[][] commands = {command1,command2,command3};

        int endTimeStamp = 20;

        String[] resultArray = eventEmitter2(events,commands,endTimeStamp);

        System.out.println("");
    }

    public static String[] eventEmitter2(int[][] events, String[][] commands, int endTimeStamp){

        //create a map for event subscribe unsubscribe data
        Map<Integer, List<String>> commandsMap = new HashMap<>();
        for(String[] command : commands){
            int eventId = Integer.parseInt(command[2]);
            String type = command[0];
            int timestamp = Integer.parseInt(command[1]);

            List<String> data;
            if(commandsMap.containsKey(eventId)){
                data = commandsMap.get(eventId);
            }else{
                data = new ArrayList<>();
            }
            data.add(type+"-"+timestamp);
            commandsMap.put(eventId,data);
        }

        List<String> resultList = new ArrayList<>();
        for(int[] event : events){
            //System.out.println("------------------------------------");
            int eventId = event[0];
            int startTime = event[1];
            int recurringInterval = event[2];

            //System.out.println("event Id is "+eventId);
            //System.out.println("startTime is "+startTime);
            //System.out.println("recurringInterval is "+recurringInterval);
            int subscribedTime=-1;
            int unsubscribedTime=-1;
            if(commandsMap.containsKey(eventId)){
                List<String> subscriptionData = commandsMap.get(eventId);
                for(String value : subscriptionData){
                    if(value.startsWith("subscribe")){
                        //System.out.println("subscribed at "+value.split("-")[1]);
                        subscribedTime = Integer.parseInt(value.split("-")[1]);
                    }else if(value.startsWith("unsubscribe")){
                        //System.out.println("unsubscribed at "+value.split("-")[1]);
                        unsubscribedTime = Integer.parseInt(value.split("-")[1]);
                    }
                }
            }
            int occurrence = countOccurrence(startTime,recurringInterval,subscribedTime,unsubscribedTime,endTimeStamp);
            resultList.add(eventId+":"+occurrence);
            //System.out.println("no of times event {} "+eventId+" executes is "+occurrence);
        }

        Collections.sort(resultList);
        String[] resultArray = new String[resultList.size()];
        resultArray = resultList.toArray(resultArray);

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(String result : resultArray){
            sb.append("\"");
            sb.append(result);
            sb.append("\"");
            sb.append(",");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("]");
        System.out.println(sb.toString());

        return resultArray;
    }

    public static int countOccurrence(int startTime, int recurringInterval, int subscribedTime, int unsubscribedTime,int endTime){
        int count=0;
        if(startTime >= subscribedTime){
            int time = startTime;
            if(unsubscribedTime > 0){
                endTime = unsubscribedTime;
            }

            while(time<=endTime){
                time=time+recurringInterval;
                count++;
            }
        }
        return count;
    }
}
