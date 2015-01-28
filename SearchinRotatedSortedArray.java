package leetcode;

import java.util.HashSet;

public class SearchinRotatedSortedArray {
	  public int search(int[] A, int target) {
	      HashSet<Integer> h = new HashSet<Integer>();
	      for(int i = 0;i<A.length;i++){
	    	  int length = h.size();
	    	  h.add(A[i]);
	    	  if(length == h.size()) return -1;
	    	  if(A[i] == target) return i;
	      }
	      return -1;
	    		  
	    }
	  public boolean search2(int[] A, int target) {
		  if(A[0] == target) return true;
		  for(int i = 1;i<A.length;i++){
			  if(A[i] == target) return true;
			  if(A[i] == A[0] && A[i-1] < A[i]) return false;
		  }
		  return false;
	  }
}
