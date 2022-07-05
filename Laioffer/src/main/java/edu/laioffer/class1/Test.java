package edu.laioffer.class1;

public class Test {

    public int[] mergeSort(int[] array){
      if(array==null || array.length<=1){
          return array;
      }
      return  divide(array,0,array.length-1);
    }

    private int[] divide(int[] array,int left,int right){
       if(left==right){
           return new int[]{array[left]};
       }

       int mid=left+(right-left)/2;

       int[] leftArray=divide(array,left,mid);
       int[] rightArray=divide(array,mid+1,right);
       int[] result=merge(leftArray,rightArray);
       return  result;
    }

    private int[] merge(int[] leftArray,int[] rightArray){
        int leftLen = leftArray.length;
        int rightLen = rightArray.length;
        int[] ans = new int[leftLen + rightLen];
        int i = 0, j = 0, k = 0;

        while (i < leftLen && j < rightLen) {
            if (leftArray[i] < rightArray[j]) {
                ans[k] = leftArray[i];
                ++i;
            }
            else {
                ans[k] = rightArray[j];
                ++j;
            }

            ++k;
        }

        while (i < leftLen) {
            ans[k] = leftArray[i];
            ++i;
            ++k;
        }

        while (j < rightLen) {
        
            ans[k] = rightArray[j];
            ++j;
            ++k;
        }
        return ans;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        int[] array=new int[]{38,27,43,3,9,82,10};

        System.out.println("Given Array");
        printArray(array);

        Test ob = new Test();
        ob.mergeSort(array);

        System.out.println("\nSorted array");
        printArray(array);
    }
}
