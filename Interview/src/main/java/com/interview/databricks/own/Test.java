package com.interview.databricks.own;

import java.util.*;

public class Test {


    public static void main(String args[]){
        List<Events> eventsList=new ArrayList<>();
        Events event1=new Events(1,0,5);
        Events event2=new Events(2,7,3);

        eventsList.add(event1);
        eventsList.add(event2);


        Commands commands1=new Commands("subscribe", 0, 1);
        Commands commands2=new Commands("unsubscribe", 15, 1);
        Commands commands3=new Commands("subscribe", 4, 2);

        List<Commands> commandsList=new ArrayList<>();
        commandsList.add(commands1);
        commandsList.add(commands2);
        commandsList.add(commands3);

        int endTimeStamp = 20;

        String[] resultArray = eventEmitter(eventsList,commandsList,endTimeStamp);

        System.out.println("");

    }

    public static String[] eventEmitter(List<Events> eventsList, List<Commands> commandsList, int endTimeStamp){

        Map<Integer,List<String>> maps=new HashMap<>();

        for(int j=0;j<commandsList.size();j++){
            Commands commands=commandsList.get(j);
            int eventId=commands.getEventid();
            String type= commands.getType();
            int timestamp=commands.getTimestamp();

            List<String> data;
            if(maps.containsKey(eventId)){
                data = maps.get(eventId);
            }else{
                data = new ArrayList<>();
            }
            data.add(type+"-"+timestamp);
            maps.put(eventId,data);
        }

        List<String> resultList = new ArrayList<>();
        for(int i=0;i<eventsList.size();i++){
            Events events=eventsList.get(i);

            int eventId=events.getLevelId();
            int startTime=events.getStartTime();
            int recurringInterval=events.getRecurringInterval();

            int subscribedTime=-1;
            int unsubscribedTime=-1;

            if(maps.containsKey(eventId)){
                List<String> subscriptionData = maps.get(eventId);
                for(String value : subscriptionData){
                    if(value.startsWith("subscribe")){
                        subscribedTime = Integer.parseInt(value.split("-")[1]);
                    }else if(value.startsWith("unsubscribe")){
                        unsubscribedTime = Integer.parseInt(value.split("-")[1]);
                    }
                }
            }
            int occurrence = countOccurrence(startTime,recurringInterval,subscribedTime,unsubscribedTime,endTimeStamp);
            resultList.add(eventId+":"+occurrence);

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
