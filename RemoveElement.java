package leetcode;

public class RemoveElement {
	 public static int removeElement(int[] A, int elem) {
	        int[] result = new int[A.length];
	        int j = 0;
	        for(int i = 0;i<A.length;i++){
	            if( A[i] != elem) {
	                result[j] = A[i];	                
	                j++;
	        }	        
	        }
	        for(int i = 0;i<j;i++){
	        	A[i] = result[i];
	        }
	        if(j == 0) return 0;
	        return j;
	    }
	 public static void main(String[] args){
		 int[] A = {4,5};
		 int elem = 5;
		 removeElement(A, elem);
		 System.out.println( removeElement(A, elem));
		 for(int i = 0;i<A.length;i++){
		 System.out.println(A[i]);
		 }
	 }
}
