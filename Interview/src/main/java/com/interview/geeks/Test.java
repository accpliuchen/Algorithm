package com.interview.geeks;

public class Test {

	// public int kth(int[] arr1,int[] arr2,int m,int n,int k){
	// 	int[] sorted1=new int[m+n];

	// 	int i = 0, j = 0, d = 0;
 //        while (i < m && j < n)
 //        {
 //            if (arr1[i] < arr2[j])
 //                sorted1[d++] = arr1[i++];
 //            else
 //                sorted1[d++] = arr2[j++];
 //        }
 //        while (i < m)
 //            sorted1[d++] = arr1[i++];
 //        while (j < n)
 //            sorted1[d++] = arr2[j++];
 //        return sorted1[k - 1];
	// }

	// public static void main(String args[]){
	// 	int arr1[]={2,3,4,7,9};
	// 	int arr2[]={1,4,8,10};
	// 	int k=5;

	// 	Test test=new Test();

	// 	int result=test.kth(arr1,arr2,5,4,k);

	// 	System.out.println("result value is "+ result);
	// }


	 static int kth(int arr1[], int arr2[], int m, int n, int k)
    {
        int[] sorted1 = new int[m + n];
        int i = 0, j = 0, d = 0;
        while (i < m && j < n)
        {
            if (arr1[i] < arr2[j])
                sorted1[d++] = arr1[i++];
            else
                sorted1[d++] = arr2[j++];
        }
        while (i < m)
            sorted1[d++] = arr1[i++];
        while (j < n)
            sorted1[d++] = arr2[j++];
        return sorted1[k - 1];
    }
     
    // Driver Code
    public static void main (String[] args)
    {
        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int k = 5;
        System.out.print(kth(arr1, arr2, 5, 4, k));
    }
}
