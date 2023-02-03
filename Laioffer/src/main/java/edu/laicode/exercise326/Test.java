package edu.laicode.exercise326;

public class Test {
    
    public static void main(String args[]){
        Test test=new Test();

        int[] array=new int[]{10,11,7,2,8,4,6,13,3};

        int[] result=test.heapify(array);

        for(int res:result){
            System.out.println(res);
        }
    }

    public int[] heapify(int[] array) {
        // Write your solution here
        if(array==null || array.length==0){
            return array;
        }

        int size=array.length;

        for(int i=size/2-1;i>=0;i--){
            percolateDown(array,i);
        }

        return array;
    }
    private void percolateDown(int[] A, int idx) {
        while (idx < A.length) {
            int leftIdx, rightIdx, left, right, sinkIdx;

            leftIdx = idx * 2 + 1;
            rightIdx = idx * 2 + 2;
            left = (leftIdx < A.length) ? A[leftIdx] : Integer.MAX_VALUE;
            right = (rightIdx < A.length) ? A[rightIdx] : Integer.MAX_VALUE;

            if (left < A[idx] && left <= right) {
                sinkIdx = leftIdx;
            } else if (right < A[idx] && right <= left) {
                sinkIdx = rightIdx;
            } else {
                return;
            }

            swap(A, idx, sinkIdx);
            /* continue to check the child node */
            idx = sinkIdx;
        }
    }

    private void swap(int[] A, int idxA, int idxB) {
        int tmp = A[idxA];
        A[idxA] = A[idxB];
        A[idxB] = tmp;
    }
}
