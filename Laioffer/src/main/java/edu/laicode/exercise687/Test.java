package edu.laicode.exercise687;

//TC = O(logn)
//SC = O(logn)
public class Test {

    public int findFirstMissingElement(int[] array) {
        // coner case
        if(array == null || array.length == 0){
            return 0;
        }

        return binarySearch(array, 0, array.length - 1);
    }

    private int binarySearch(int[] array, int left, int right){
        if(left > right){
            return right + 1;
        }
        if(array[left] != left){
            return left;
        }

        int mid = left + (right - left) / 2;
        if(array[mid] == mid){
            return binarySearch(array, mid + 1, right);
        }
        return binarySearch(array, left, mid);
    }

    public static void main(String args[]){
        int[] array=new int[]{4, 5, 10, 11};

        Test test=new Test();
        int result=test.findFirstMissingElement(array);

        System.out.println(result);
    }
}
