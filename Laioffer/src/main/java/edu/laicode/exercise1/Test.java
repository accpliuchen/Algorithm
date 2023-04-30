package edu.laicode.exercise1;

public class Test {

	public int longest(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}

		int len = array.length;
		int result = 1;
		int[] smlRec = new int[len + 1];
		smlRec[1] = array[0];

		for (int i = 1; i < len; ++i) {
			int distance = find(smlRec, 1, result, array[i]);

			if (distance == result) {
				++result;
			}

			smlRec[distance + 1] = array[i];
		}

		return result;
	}

	private int find(int[] smlRec, int sh, int lo, int target) {
		while (sh < lo - 1) {
			int mid = sh + (lo - sh) / 2;

			if (smlRec[mid] >= target) {
				lo = mid - 1;
			}
			else {
				sh = mid;
			}
		}

		for (int i = lo; i >= sh; --i) {
			if (smlRec[i] < target) {
				return i;
			}
		}

		return 0;
	}


	public static void main(String args[]){
		int[] array=new int[]{5, 2, 6, 3, 4, 7, 5};
		
		Test test=new Test();
		int result=test.longest(array);
		
		System.out.println(result);
	}
}
