package com.interview.exercise.test;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.*;

public class Test {
//
//
//    static int evenSumK(int arr[], int N)
//    {
//
//
//        // Stores maximum even
//        // subsequence sum
//        int maxSum = 0;
//
//        // Stores Even numbers
//        ArrayList<Integer> Even = new ArrayList<Integer>();
//
//
//        // Traverse the array
//        for (int i = 0; i < N; i++) {
//
//            // If current element
//            // is an odd number
//            if (arr[i] % 2 != 1) {
//
//                // Insert even numbers
//                Even.add(arr[i]);
//            }
//        }
//
//
//        // Sort Even[] array
//        Collections.sort(Even);
//
//        // Stores current index
//        // Of Even[] array
//        int i = Even.size() - 1;
//        int K=arr.length;
//
//        while (K > 0) {
//
//            // If K is odd
//            if (K % 2 == 1) {
//
//                // If count of elements
//                // in Even[] >= 1
//                if (i >= 0) {
//
//                    // Update maxSum
//                    maxSum += Even.get(i);
//
//                    // Update i
//                    i--;
//                }
//
//                // If count of elements
//                // in Even[] array is 0.
//                else {
//                    return -1;
//                }
//
//                // Update K
//                K--;
//            }
//
//            // If count of elements
//            // in Even[] and odd[] >= 2
//            else if (i >= 1) {
//
//                    // Update maxSum
//                    maxSum += Even.get(i) + Even.get(i - 1);
//
//                    // Update i
//                    i -= 2;
//
//                // Update K
//                K -= 2;
//            }
//
//            // If count of elements
//            // in Even[] array >= 2.
//            else if (i >= 1) {
//
//                // Update maxSum
//                maxSum += Even.get(i) + Even.get(i - 1);
//
//                // Update i
//                i -= 2;
//
//                // Update K
//                K -= 2;
//            }
//
//        }
//        return maxSum;
//    }
//
//    // Driver code
//    public static void main(String[] args)
//    {
////        int arr[] = { 2, 4, 10, 3, 5 };
////        int N = arr.length;
////        int K = 3;
////
////        System.out.println(evenSumK(arr, N));
//
////        char[] s=new char[]{'h','e','l','l','o'};
////        char[] c=new char[s.length];
////        char temp;
////        int k=s.length-1;
////        int a=0;
////        while(k>0){
////            temp=s[k];
////            s[k]=s[a];
////            s[a]=temp;
////            k--;
////            a++;
////        }
////
////        for(int j=0;j<s.length;j++){
////            System.out.print(s[j]);
////        }
//
//    }
//}
//
////    public static int maxSum(int[][] matrix){
////        int len=matrix.length-1;
////        int max[]=matrix[len];
////
////        for(int i=len-1;i>=0;i--){
////            for(int j=0;j<=i;j++){
////                max[j]=Math.max(max[j],max[j+1])+matrix[i][j];
////            }
////        }
////        return  max[0];
////    }
////
////    public static int coverStringToBinary(String str,int num){
////        int coveredInt=0;
////
////        for(int i=0;i<str.length();i++){
////            if(str.charAt(i)=='1'){
////                int len=str.length()-1-i;
////                coveredInt+=Math.pow(num,len);
////            }
////        }
////
////        return coveredInt;
////    }
////
////    public static int val(char c)
////    {
////        if (c >= '0' && c <= '9')
////            return (int)c - '0';
////        else
////            return (int)c - 'A' + 10;
////    }
////
////    public static int toDeci(String str, int base)
////    {
////        int len = str.length();
////        int power = 1; // Initialize
////        // power of base
////        int num = 0; // Initialize result
////        int i;
////
////        // Decimal equivalent is
////        // str[len-1]*1 + str[len-2] *
////        // base + str[len-3]*(base^2) + ...
////        for (i = len - 1; i >= 0; i--)
////        {
////            // A digit in input number
////            // must be less than
////            // number's base
////            if (val(str.charAt(i)) >= base)
////            {
////                System.out.println("Invalid Number");
////                return -1;
////            }
////
////            num += val(str.charAt(i)) * power;
////            power = power * base;
////        }
////
////        return num;
////    }
////
////    public static void main(String args[]){
////
////        int[][] matrix={{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
////
////        //int result=Test.maxSum(matrix);
////
////       // System.out.println("result value is "+result);
////
////        System.out.println("coverStringToBinary is "+coverStringToBinary("111",2));
////
////        System.out.println("coverStringToBinary is "+coverStringToBinary("457",10));
////
////        System.out.println("coverStringToBinary is "+coverStringToBinary("17",8));
////
////
////        System.out.println("coverStringToBinary is "+toDeci("111",2));
////        System.out.println("coverStringToBinary is "+toDeci("457",10));
////        System.out.println("coverStringToBinary is "+toDeci("17",8));
////
////    }


    public static void main(String[] args) {

        //"2022/01/28 14:27:00", "2022/01/28 15:27:00" => 1
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date d1 = sdf.parse("2022/01/26 12:27:00");
            Date d2 = sdf.parse("2022/01/28 12:27:00");

            //System.out.println("hourse value is "+differHour(d1,d2));

            for(int i=0;i<getDatesBetween(d1,d2).size();i++){
                Date stampe= (Date) getDatesBetween(d1,d2).get(i);
                SimpleDateFormat format=new SimpleDateFormat("E");
                System.out.println(format.format(stampe));
            }

            System.out.println("different  "+ differentDaysByMillisecond(d1,d2)+" hours");

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static int differentDaysByMillisecond(Date date1,Date date2)
    {
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600));
        return days;
    }

    private static Calendar getCalendarWithoutTime(Date date) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

    public static List getDatesBetween(Date startDate, Date endDate) {
        List datesInRange = new ArrayList<>();
        Calendar calendar = getCalendarWithoutTime(startDate);
        Calendar endCalendar = getCalendarWithoutTime(endDate);

        while (calendar.before(endCalendar)) {
            Date result = calendar.getTime();
            datesInRange.add(result);
            calendar.add(Calendar.DATE, 1);
        }

        return datesInRange;
    }

    public static int daysBetween(Date smdate,Date bdate) throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        smdate=sdf.parse(sdf.format(smdate));
        bdate=sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);

        return Integer.parseInt(String.valueOf(between_days));
    }


//    public static int daysBetween(String smdate,String bdate) throws ParseException{
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(sdf.parse(smdate));
//        long time1 = cal.getTimeInMillis();
//        cal.setTime(sdf.parse(bdate));
//        long time2 = cal.getTimeInMillis();
//        long between_days=(time2-time1)/(1000*3600*24);
//
//        return Integer.parseInt(String.valueOf(between_days));
//    }



    public static int differHour(Date smdate,Date bdate){
      int hour=0;
      try{

          SimpleDateFormat sdf=new SimpleDateFormat("hh");
          smdate=sdf.parse(sdf.format(smdate));
          bdate=sdf.parse(sdf.format(bdate));

          long fdate=smdate.getTime();
          long sdate=bdate.getTime();

          BigInteger startStampInt=BigInteger.valueOf(Long.valueOf(String.valueOf(fdate)));
          BigInteger endStampInt=BigInteger.valueOf(Long.valueOf(String.valueOf(sdate)));

          BigInteger apartStamp=endStampInt.subtract(startStampInt);
          BigInteger hoursStamp=BigInteger.valueOf(Long.valueOf(1000*60*60));
          BigInteger hours=apartStamp.divide(hoursStamp);
          hour=hours.intValue();

      }catch(Exception e){
          e.printStackTrace();
      }

      return hour;
    }

    static long days(Date start, Date end){
        //Ignore argument check

        Calendar c1 = Calendar.getInstance();
        c1.setTime(start);
        int w1 = c1.get(Calendar.DAY_OF_WEEK);
        c1.add(Calendar.DAY_OF_WEEK, -w1);

        Calendar c2 = Calendar.getInstance();
        c2.setTime(end);
        int w2 = c2.get(Calendar.DAY_OF_WEEK);
        c2.add(Calendar.DAY_OF_WEEK, -w2);

        //end Saturday to start Saturday
        long days = (c2.getTimeInMillis()-c1.getTimeInMillis())/(1000*60*60*24);
        long daysWithoutWeekendDays = days-(days*2/7);

        // Adjust days to add on (w2) and days to subtract (w1) so that Saturday
        // and Sunday are not included
        if (w1 == Calendar.SUNDAY && w2 != Calendar.SATURDAY) {
            w1 = Calendar.MONDAY;
        } else if (w1 == Calendar.SATURDAY && w2 != Calendar.SUNDAY) {
            w1 = Calendar.FRIDAY;
        }

        if (w2 == Calendar.SUNDAY) {
            w2 = Calendar.MONDAY;
        } else if (w2 == Calendar.SATURDAY) {
            w2 = Calendar.FRIDAY;
        }

        return daysWithoutWeekendDays-w1+w2;
    }


    public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);

        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);

        int workDays = 0;

        //Return 0 if start and end are the same
        if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
            return 0;
        }

        if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
            startCal.setTime(endDate);
            endCal.setTime(startDate);
        }

        do {
            //excluding start date
            startCal.add(Calendar.DAY_OF_MONTH, 1);
            if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                ++workDays;
            }
        } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

        return workDays;
    }

    public static long differHours(Date smdate,Date bdate){
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;

        // 获得两个时间的毫秒时间差异
        long diff = smdate.getTime() - bdate.getTime();
        // 计算差多少天
        //long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;

        return  hour;
    }

}
