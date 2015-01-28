package leetcode;

public class FindMinimuminRotatedSortedArrayII {
	public int findMin(int[] num) {
		int min = num[0];
        for(int i = 0;i < num.length ;i++){
        	if(num[i] < min) min = num[i];
        }
        return min;
    }
}
