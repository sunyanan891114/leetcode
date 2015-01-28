package leetcode;

public class RemoveDuplicatesfromSortedArrayII {	
	public int removeDuplicates(int[] A) {
		boolean flag = false;
		int m = A.length;
		for(int i = 0;i<m-1;i++){
			if(A[i] != A[i+1])flag = false;
			else if( flag ){
				for(int j = i+1;j<m;j++){
					A[j] = A[j+1];
				}
				m--;
				i--;
			}
			else{
				flag = true;
			}
		}
		return m;
        
    }
	public static void main(String[]args ){
		
	}
}
