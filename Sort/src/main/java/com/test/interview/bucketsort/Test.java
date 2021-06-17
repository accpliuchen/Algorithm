package com.test.interview.bucketsort;


//https://www.pdai.tech/md/algorithm/alg-sort-x-bucket.html
public class Test {

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void bucketSort(int[] a,int max){
        int[] buckets;


        if(a==null || max<1)
            return ;

        buckets=new int[max];

        for(int i=0;i<a.length;i++)
            buckets[a[i]]++;

        for(int i=0,j=0;i<max;i++){
            while( (buckets[i]--) >0 ) {
                a[j++] = i;
            }
        }

        printArray(buckets);
        buckets=null;
    }

    public static void main(String args[]){
        int i;
        int a[]={8,2,3,4,3,6,6,3,9};

        System.out.println("before sort:");

        for(i=0;i<a.length;i++)
            System.out.printf("%d ", a[i]);
        System.out.println("\n");

        bucketSort(a, 10);


        System.out.println("after sort:");
        for(i=0;i<a.length;i++)
            System.out.printf("%d ", a[i]);
        System.out.println("\n");
    }
}
