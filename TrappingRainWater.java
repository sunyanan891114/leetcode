package leetcode;

public class TrappingRainWater {
	public int trap(int[] A) {
		if(A.length <= 2) return 0;
		int result = 0;
		int[] leftmax = new int[A.length];
		int[] rightmax =  new int[A.length];
		for(int i = 1;i<A.length;i++){
			leftmax[i] = Math.max(leftmax[i-1], A[i-1]);
		}
		for(int i = A.length-2;i>=0;i--){
			rightmax[i] = Math.max(rightmax[i+1], A[i+1]);
		}
        for(int i = 1;i<A.length;i++){
        	int max = Math.min(leftmax[i], rightmax[i]);
        	if(A[i]<max)
        		result  = result + max-A[i];
        }
        return result;
    }
}
