package leetcode;

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] A) {
		if(A.length == 1) return 1;
        int length = 1;
        for(int i = 1;i < A.length;i++){
        	if(A[i] != A[i-1]){
        		A[length] = A[i];
        		length++;
        	}
        }
        return length++;
    }
}
