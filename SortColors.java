package leetcode;




public class SortColors {
	 public static void sortColors(int[] A) {
		 sort(A,0,A.length-1);
	    }
	 public static void sort(int[] A,int start,int end){
		 if(start<end){
		     int mid = partition(A, start, end);
		     if(mid >= 2)
		     sort(A,start,mid-1);
		     if(mid < A.length -2)
		     sort(A, mid+1, end);	 
		 	}
	 }
	 public static int partition(int[]A,int start,int end){
		 int x = A[end];
		 int store = start-1;
		 for(int i = start;i < end;i++){
			if(A[i] <= x){
				store++;
				int temp = A[i];
				A[i] = A[store];
				A[store] = temp;
			}
		}
		int temp = A[end];
		A[end] = A[store+1];
		A[store+1] = temp;
		return store+1;
	 }
	 public static void sortColors2(int[] A) {
		 int start = 0;
		 int end = A.length-1;
		 int i = 0;
		 int temp;
		 while(i <= end && start < end){
			 if(A[i] > 1){
				 temp = A[i];
				 A[i] = A[end];
				 A[end] = temp;
				 end--;
			 }
			 else if(A[i] < 1){
				 temp = A[i];
				 A[i] = A[start];
				 A[start] = temp;
				 start++;
				 if(i<start) i = start;
			 }
			 else{
				 i++;
			 }
		 }
	    }
	 public static void main(String[] args){
		 int[] A = {0,1,2};
		 sortColors2(A);
		 for(int i = 0;i<A.length;i++)
		 System.out.println(A[i]);
	 }
}
