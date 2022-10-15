package edu.laicode.exercise147;

import java.util.List;
import java.util.ArrayList;

public class Test {

	public List<String> Restore(String ip) {
		List<String> ans=new ArrayList();

		if(ip==null || ip.length()==0){
			return ans;
		}

		StringBuilder sb=new StringBuilder();
		char[] ipDigits=ip.toCharArray();

		dfs(ipDigits, sb, 0, 0, ans);
		return ans;
	}

	private void dfs(char[] ipDigits,StringBuilder sb,int level,int offset,List<String> ans){
		if (level == 4) {
	      if (sb.length() == ipDigits.length + 4) {
	        ans.add(sb.substring(0, sb.length() - 1));
	      }

	      return;
	    }

	    if (offset < ipDigits.length) {
			dfs(ipDigits, sb.append(ipDigits[offset]).append('.'), level + 1, offset + 1, ans);

	      sb.delete(sb.length() - 2, sb.length());
	    }

	    if (offset + 1 < ipDigits.length) {
	      char a = ipDigits[offset];
	      char b = ipDigits[offset + 1];

	      if (a != '0') {
			  dfs(ipDigits, sb.append(a).append(b).append('.'), level + 1, offset + 2, ans);

	        sb.delete(sb.length() - 3, sb.length());
	      }
	    }

	    if (offset + 2 < ipDigits.length) {
	      char a = ipDigits[offset];
	      char b = ipDigits[offset + 1];
	      char c = ipDigits[offset + 2];

	      if (a == '1' || (a == '2' && b >= '0' && b <='4') || (a == '2' && b == '5' && c >= '0' && c <= '5')) {
			  dfs(ipDigits, sb.append(a).append(b).append(c).append('.'), level + 1, offset + 3, ans);

	        sb.delete(sb.length() - 4, sb.length());
	      }
	    }
	}

	public static void main(String args[]){
		String ip="25525511135";

		Test test=new Test();
		List<String> result=test.Restore(ip);


		System.out.println("===");
	}
}
