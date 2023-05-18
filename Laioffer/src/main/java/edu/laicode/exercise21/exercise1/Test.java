package edu.laicode.exercise21.exercise1;

public class Test {

    public int search(int[] array,int target){

        int left=0;
        int right=array.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(array[mid]==target){
                return mid;
            }else if(array[mid]>=array[left]){
                if(target<array[left] || target>array[mid]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }else{
                if(target>array[right] || target<array[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int[] array = new int[]{1,2,3,4,5};
        int target=4;

        Test test=new Test();
        int result=test.search(array,target);

        System.out.println(result);
    }
}
