package edu.laicode.exercise267;

public class Test {

//    public int[] search(int[][] matrix, int target) {
//        // Write your solution here
//        if(matrix==null || matrix.length==0){
//            return new int[]{-1,-1};
//        }
//
//        int rows=matrix.length;
//        int cols=matrix[0].length;
//        int left=0;
//        int right=rows*cols-1;
//
//        while(left<=right){
//            int mid=left+(right-left)/2;
//
//            int row=mid/cols;
//            int col=mid%cols;
//
//            if(matrix[row][col]==target){
//                return new int[]{row,col};
//            }else if(matrix[row][col]>target){
//                right=mid-1;
//            }else{
//                left=mid+1;
//            }
//        }
//
//        return new int[]{-1,-1};
//    }

//    public int[] search(int[][] matrix, int target) {
//        // Write your solution here
//
//        int m = matrix.length;
//        int n = matrix[0].length;
//        if(m == 0 && n == 0){
//            return new int[]{-1, -1};
//        }
//
//        // change 2d to 1d array
//        int[] arr = new int[m*n];
//        int index = 0;
//        for(int i=0; i < m; i++){
//            for(int j=0; j < n; j++){
//                arr[index] = matrix[i][j];
//                index ++;
//            }
//        }
//
//        int left = 0;
//        int right = arr.length-1;
//        int res = -1;
//        while(left < right - 1){
//            int mid = left + (right-left) / 2;
//            if(arr[mid] == target){
//                res = mid;
//            } else if(arr[mid] > target){
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        if(arr[left] == target){
//            res = left;
//        }
//        if(arr[right] == target){
//            res = right;
//        }
//
//        if(res != -1){
//            int row = index / m;
//            int col = index % n;
//            return new int[]{row, col};
//        }
//        return new int[]{-1, -1};
//
//
//    }


    public int[] search(int[][] matrix, int target) {
        // Write your solution here
        if (matrix == null && matrix.length == 0) {
            return new int[]{-1, -1};
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        int mid = 0;
        int row = 0;
        int col = 0;

        while (left < right - 1) {
            mid = left + (right - left) / 2;
            row = mid / n;
            col = mid % n;
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        row = left / n;
        col = left % n;
        if (matrix[row][col] == target) {
            return new int[]{row, col};
        }
        row = right / n;
        col = right % n;
        if (matrix[row][col] == target) {
            return new int[]{row, col};
        }
        return new int[]{-1, -1};
    }
        public static void main(String args[]){

        int[][] matrix=new int[][]{{1,2,5,6,8},{4,5,5,7,11},{7,7,10,11,11},{9,12,14,14,14}};

        int target=10;

        Test test=new Test();
        int[] result=test.search(matrix,target);

        for(int res:result)
            System.out.println(res);
    }
}
