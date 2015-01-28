package leetcode;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		if(height.length <2) return 0;		
		int x = 0;
		int y = height.length-1;
		int result = (y-x)*Math.min(height[y],height[x]);
		int i = x+1;
		int j = y-1;
		while(i < j){
			if(height[x] <= height[y]){
				if(height[i] > height[x]){
					x = i;
				}
				i++;								
			}
			else{
				if(height[j] > height[y]){
					y = j;
				}				
				j--;
			}
			result = Math.max(result, (y-x)*Math.min(height[y],height[x]));
		}
		return result;       
    }
}
