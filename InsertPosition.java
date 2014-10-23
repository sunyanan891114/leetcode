package leetcode;

public class InsertPosition {
	  public static  int searchInsert(int[] A, int target) {
		  if(target < A[0]) return 0;
	        for(int i = 0;i<A.length;i++){	        	
	        	if(A[i] == target ) return i ;
	        	else if(i+1 == A.length) return A.length;
	        	else if(A[i] < target & A[i+1]>target)
	        		return i;
	        }
	        return 0;
	    }
}
