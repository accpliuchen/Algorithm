package edu.laicode.exercise400;

public class Test {

  public int[] rainbowSortIII(int[] array, int k) {
    // Write your solution here
   if (array == null || array.length < 2) {
        return array;
    }
    int left = 0;
    int right = array.length - 1;
    for (int round = 1; round <= k / 2; round++) {
        // since leftColor + rightColor == k + 1
        int leftColor = round;
        int rightColor = k + 1 - round;
        for (int i = left; i <= right; i++) {
            if (array[i] == leftColor) {
                swap(array, i, left);
                left++;
            } else if (array[i] == rightColor) {
                swap(array, i, right);
                i--;
                right--;
            }
        }
    }
    return array;
  }

  private void swap(int[] array, int left, int right) {
      int tmp = array[left];
      array[left] = array[right];
      array[right] = tmp;
  }

  public static void main(String args[]){
  		int[] arrays=new int[]{3,1,5,5,1,4,2};
  		int target=5;
        
        Test test=new Test();
        int[] result=test.rainbowSortIII(arrays,target);

		for (int num : result) 
        {
        	System.out.print(num);
        }
  }
}
