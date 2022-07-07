package edu.laicode.exercise4;

public class Test {

//    public int[] solve(int[] array) {
//
//        if(array==null || array.length<=1){
//            return array;
//        }
//
//        for(int i=0;i<array.length;i++){
//            for(int j=i+1;j< array.length;j++){
//                if(array[i]>array[j]){
//                    swap(array,i,j);
//                }
//            }
//        }
//        return array;
//    }

    public int[] solve(int[] array) {

        if(array==null || array.length<=1){
            return array;
        }
        System.out.println("Before");
        printArray(array);

        System.out.println("Sorting");
        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (array[j] < array[min_idx]){
                    min_idx = j;
                }
            }
            swap(array,min_idx,i);
            printArray(array);
        }
        return array;
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    private void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String args[]){
       //int[] array=new int[]{4, 2, -3, 6, 1};
       int[] array=new int[]{64,25,12,22,11};

       Test test=new Test();

       int[] arrays=test.solve(array);

       for(int arr:arrays){
           System.out.print(arr+" ");
       }
    }
}
