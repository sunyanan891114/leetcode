package leetcode;

public class MaximumSubarray {
	 public static int maxSubArray(int[] A) {
		 int i = 0;
		 int start = 0;
		 int result = 0;
		 int end = 0;
	        while(i < A.length){
	        	if(i == start & A[i] > 0){
	        		start = i;
	        		result = A[i];
	        		end =  result > end ? result :end; 
	        		i++;
	        	}
	        	else if(i == start & A[i] <=0){
	        	    if(i ==0)end = A[i];
	        	    result = A[i];
	        	    end =  result > end ? result :end; 
	        		i++;
	        		start = i;
	        		
	        	}
	        	else if(i != start ){
	        		
	        		result = result  + A[i];
	        		end =  result > end ? result :end; 
	        		if(result >= 0)	i++;
	        		else {
	        			i++;
		        		start = i;
		        		result = 0;
	        		}
	        	}	
	        }
	        return end;
	    }
	 public static void main(String[] args){
		 int[] A = {3,2,-3,-1,1,-3,1,-1};
		 System.out.println(maxSubArray(A));
	 }
}
