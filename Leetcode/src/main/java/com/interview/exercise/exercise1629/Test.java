package com.interview.exercise.exercise1629;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class Test {


        public char slowestKey(int[] releaseTimes, String keysPressed) {
            HashMap<Character,Integer> countMap=new HashMap<>();
            char candidates=keysPressed.charAt(0);
            int max=releaseTimes[0];

            for(int i=1;i<releaseTimes.length;i++){
                //int diff=Math.max(max,releaseTimes[i]-releaseTimes[i-1]);
                int diff=releaseTimes[i]-releaseTimes[i-1];
                if(diff>max || (diff==max && keysPressed.charAt(i)>candidates)){
                    candidates=keysPressed.charAt(i);
                    max=diff;
                }
            }


            return candidates;
        }

        public static void main(String[] args) {
            int[] releaseTimes = new int[]{9,29,49,50};
            String keysPressed = "cbcd";

//            int[] releaseTimes = new int[]{28,65,97};
//            String keysPressed = "gaf";

            Test test=new Test();
            char result=test.slowestKey(releaseTimes,keysPressed);

            System.out.println("result value is "+ result);
        }
}
