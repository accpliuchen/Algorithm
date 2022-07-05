package edu.laicode.exercise162;

public class Test {

    public int[] plusOne(int[] digits) {
        if(digits==null || digits.length==0) return digits;

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }

        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
    }

    public static void main(String args[]){
        //int[] digits=new int[]{9};

        int[] digits=new int[]{9,9,9};

        Test test=new Test();
        int[] arrays=test.plusOne(digits);

        for(int arr:arrays){
            System.out.print(arr+" ");
        }
    }
}
