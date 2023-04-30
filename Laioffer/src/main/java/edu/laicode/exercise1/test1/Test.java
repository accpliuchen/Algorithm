package edu.laicode.exercise1.test1;

public class Test {

    public int longest(int[] array){
    	if(array.length==0){
    		return 0;
    	}

    	int[] table=new int[array.length+1];
    	int result=1;
    	table[1]=array[0];

    	for(int i=1;i<array.length;i++){
    		int index=find(table,1,result,array[i]);

    		if(index==result){
    			table[++result]=array[i];
    		}else{
    			table[index+1]=array[i];
    		}
    	}


    	return result;
    }

	private int find(int[] table,int left,int right,int target){
		while(left<=right){
			int mid=left+(right-left)/2;

			if(table[mid]>=target){
					right=mid-1;
			}else{
					left=mid+1;
			}
		}

		return right;
	}

	public static void main(String args[]){
		int[] array=new int[]{5, 2, 6, 3, 4, 7, 5};
		
		Test test=new Test();
		int result=test.longest(array);
		
		System.out.println(result);
	}
}
