package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	 public static List<Integer> grayCode(int n) {
		 List<Integer> result = new ArrayList<Integer>();		 
		 if(n == 0) {
	    	 result.add(0);
	    	 return result;
	     }
	     result = grayCode(n-1);
	     int length = result.size();
	     for(int i = 0;i<length;i++){	    	 
	    	 result.add((int) (result.get(length-i-1)+Math.pow(2, n-1))); 
	     }
	     return result;
	     
	    }
}
