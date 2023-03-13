package edu.laicode.exercise263;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


class TestDemo {
    // creating a private field
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    // Constructor of this class

    // Constructor 1
    // Public constructor
    public TestDemo() { s = "GeeksforGeeks"; }

    // Constructor 2
    // no arguments
    public void method1()
    {
        System.out.println("The string is " + s);
    }

    // Constructor 3
    // int as argument
    public void method2(int n)
    {
        System.out.println("The number is " + n);
    }

    // Constructor 4
    // Private method
    private void method3()
    {
        System.out.println("Private method invoked 3 ");
    }

    private void method4()
    {
        System.out.println("Private method invoked 4");
    }
}

public class Test {


    public static void  funcTwins(int[] inputArr)
    {
        // Write your code here
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<inputArr.length;i++){
            //map.put(new Integer(inputArr[i]),map.getOrDefault(inputArr[i])+1);
            if(map.containsKey(inputArr[i])){
                map.put(inputArr[i],map.get(inputArr[i])+1);
            }
            map.put(inputArr[i],1);
        }

        PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue().equals(1)){
                minHeap.offer(entry.getKey());
            }
        }

        Integer res=minHeap.poll();
        System.out.print(res);
    }

    public static int minDifference(int[] array){

        if(array==null || array.length==0){
            return 0;
        }

        int arrSum=0;
        for(int i:array){
            arrSum+=i;
        }

        int[] min=new int[]{Integer.MAX_VALUE};

        helper(array, 0, 0, 0, arrSum, min);
        return min[0];
    }

    private static void helper(int[] array,int index,int count,int sum,int arrSum,int[] min){

        if(count==array.length/2){
            if(Math.abs(sum-(arrSum-sum))<min[0]){
                min[0]=Math.abs(sum-(arrSum-sum));
            }
        }

        if(index==array.length){
            return;
        }

        //add
        helper(array,index+1,count+1,sum+array[index],arrSum,min);


        //remove
        helper(array,index+1,count,sum,arrSum,min);
    }


    public void call(Object obj,String methodName) throws Exception {
        Class cls = obj.getClass();

        Field example = cls.getDeclaredField("s");
        //example.set();

        Method methodcall3
                = cls.getDeclaredMethod(methodName);

        // Allows the object to access the method
        // irrespective of the access specifier used with
        // the method
        methodcall3.setAccessible(true);

        // Invoking the method at runtime
        methodcall3.invoke(obj);

    }

    public static void main(String args[]) throws Exception {
        int[] array=new int[]{1,3,2};

        Test test=new Test();
        int result=minDifference(array);

        System.out.println(result);


        // Creating an object of class 1 inside main()
        // method
        TestDemo obj = new TestDemo();
        //
        obj.method2(20);

        // Creating class object from the object using
        // getClass() method
        Class cls = obj.getClass();

        // Printing the name of class
        // using getName() method
        System.out.println("The name of class is "
                + cls.getName());

        // Getting the constructor of the class through the
        // object of the class
        Constructor constructor = cls.getConstructor();

        // Printing the name of constructor
        // using getName() method
        System.out.println("The name of constructor is "
                + constructor.getName());

        // Display message only
        System.out.println(
                "The public methods of class are : ");

        // Getting methods of the class through the object
        // of the class by using getMethods
        Method[] methods = cls.getMethods();

        // Printing method names
        for (Method method : methods){
            System.out.println(method.getName());
            if(method.getName().equals("methods2")){


            }
        }

        // Creates object of desired method by
        // providing the method name and parameter class as
        //  arguments to the getDeclaredMethod() method
        Method methodcall1
                = cls.getDeclaredMethod("method2", int.class);

        // Invoking the method at runtime
        methodcall1.invoke(obj, 19);


        // Creates object of the desired method by providing
        // the name of method as argument to the
        // getDeclaredMethod() method
//        Method methodcall3
//                = cls.getDeclaredMethod("method3");
//
//        // Allows the object to access the method
//        // irrespective of the access specifier used with
//        // the method
//        methodcall3.setAccessible(true);
//
//        // Invoking the method at runtime
//        methodcall3.invoke(obj);

        String[] arrays=new String[]{"method3","method4"};
        test.call(obj,"method3");
        test.call(obj,"method4");
    }
}
