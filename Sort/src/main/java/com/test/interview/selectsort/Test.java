package com.test.interview.selectsort;

public class Test {

    public  static void main(String args[]){
//        String[] arr=new String[]{"Math", "Business", "English", "Business", "Math", "Math"};
//
//        Map<String,Integer> map=new HashMap<>();
//
//        for(String str:arr){
//            Integer num=map.get(str);
//            map.put(str,num==null?1:num+1);
//        }
//
//        Set set=map.entrySet();
//        Iterator it=set.iterator();
//
//        while(it.hasNext()){
//            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
//            System.out.println("单词 " + entry.getKey() + " 出现次数 : " + entry.getValue());
//        }
        String str="abcabcbb";
        int a=sort(str);

        //System.out.println(a);




    }


    public static int[] selectionSort(int[] arr){
        int len=arr.length;
        
        return arr;
    }


    public static int sort(String array){
        int n = array.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            System.out.print("array.charAt(j)===="+array.charAt(j) );
            System.out.print("  index==="+index[array.charAt(j)]);
            System.out.println("  max==="+Math.max(index[array.charAt(j)], i));

            i = Math.max(index[array.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[array.charAt(j)] = j + 1;
        }
        return ans;
    }


    public static void printArray(String[] arrays){
        for(String str:arrays){
            System.out.println(str);
        }
    }

}
