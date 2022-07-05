package edu.laicode.exercise4;

public class Test {

    public int[] solve(int[] array) {

        if(array==null || array.length<=1){
            return array;
        }

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]<array[j]){
                    swap(array,i,j);
                }
            }
        }
        return array;
    }

    private void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String args[]){
       int[] array=new int[]{4, 2, -3, 6, 1};

       Test test=new Test();

       int[] arrays=test.solve(array);

       for(int arr:arrays){
           System.out.println(arr);
       }
    }
}
