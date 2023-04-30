package edu.laicode.exercise21;

public class Test {
    public int search(int[] array, int target) {
        // Write your solution here

        int left=0;
        int right=array.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(array[mid]==target){
                return mid;
            }else if(array[left]<=array[mid]){
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
        int[] array = new int[]{20,30,2,12,13,14,15};
        int target=2;

        Test test=new Test();
        int result=test.search(array,target);

        System.out.println(result);
    }
    
}
