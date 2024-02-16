package com.interview.exercise.exercise409;

public class Solution {

    private static final String document;

    static {
        final StringBuffer sb = new StringBuffer();
        sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
        sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
        sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

        document = sb.toString();
    }

    public static double shortestDistance(final String document, String word1, String word2) {
        String[] words = document.split("[,.\\s]");

        int index = 0;
        double shortest = document.length();
        double word1Loc = 0;
        double word2Loc = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(word1)) {
                word1Loc = index + (word.length()/2.0);
            } else if (word.equalsIgnoreCase(word2)) {
                word2Loc = index + (word.length()/2.0);
            }

            if (word1Loc > 0 && word2Loc > 0) {
                double current = Math.abs(word2Loc - word1Loc);
                if (current < shortest) {
                    shortest = current;
                }
            }

            index += word.length() + 1;
        }

        //System.out.println(shortest);

        if (word1Loc == 0 || word2Loc == 0) {
            return -1;
        }

        return shortest;
    }


    public static void main(String[] args) {
       double result=shortestDistance("This is a sample document we just made up", "we", "just" );

       System.out.println(result);

        System.out.println(shortestDistance( "This is a sample document we just made up", "is", "a" ));
        System.out.println(shortestDistance( "This is a sample document we just made up", "is", "not" ));
    }
}

