package edu.laicode.exercise208;


import java.util.List;
import java.util.ArrayList;

public class Test {

    public List<Integer> majority(int[] array,int k){
    	if(k<2){
    		return null;
    	}

    	int[][] major=new int[k][2];

 		for(int i=0;i<array.length;i++){
 			int comp=0;

 			for(int j=0;j<major.length;j++){
 				if(major[j][0]==0){
 					major[j][0]=1;
 					major[j][1]=array[i];
 					break;
 				}else if(major[j][1]==array[i]){
 					major[j][0]++;
 					break;
 				}else{
 					comp++;
 				}
 			}

 		if(comp==k) {	
		  for(int j=0; j<major.length; j++) {
				if(major[j][0]>0) {
					major[j][0]--;	//所有freq都--
				}
			}
		 }

 	   }

 	   for(int i=0;i<k;i++){
 	   	 major[i][0]=0;
 	   }

 	   for(int j=0;j<array.length;j++){
 	   	for(int i=0;i<k;i++){
 	   		if(major[i][1]==array[j]){
 	   			major[i][0]++;
 	   		}
 	   	 }
 	   }

 	   List<Integer> result=new ArrayList<Integer>();
		for(int i=0; i<k; i++) {
			if(major[i][0]>array.length/k) {
				result.add(major[i][1]);//验证通过的话，加入结果
			}
		}
		return result;

    }
 
	public static void main(String args[]){
		int[] array=new int[]{1,2,1,2,1};
		int k=3;

//		int[] array=new int[]{1, 2, 1, 2, 3, 3, 1};
//		int k=4;

//		int[] array=new int[]{2,1};
//		int k=2;

		Test test=new Test();
		List<Integer> result=test.majority(array,k);

		for(Integer nums:result){
			System.out.println("result value is "+ nums);
		}
	}
}
