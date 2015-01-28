package leetcode;

import java.util.Arrays;

public class MaximumGap {
	 public static int maximumGap(int[] num) {
	        int n = num.length;
	        if(n < 2) return 0;
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        for(int i :num){
	        	min = Math.min(i, min);
	        	max = Math.max(i, max);
	        }
	        int len = (int) Math.ceil((double)(max-min)/(n-1));
	        int[] bucket_min = new int[n-1];
	        int[] bucket_max = new int[n-1];
	        Arrays.fill(bucket_max, Integer.MIN_VALUE);
	        Arrays.fill(bucket_min, Integer.MAX_VALUE);
	        for(int i :num){
	        	if(i == min || i == max) continue;
	        	int idx = (i-min)/len;
	        	bucket_min[idx] = Math.min(i, bucket_min[idx]);
	        	bucket_max[idx] = Math.max(i, bucket_max[idx]);
	        }
	        int result = Integer.MIN_VALUE;
        	int prev = -1;
        	int first = -1;
        	for(int i = 0;i<n-1;i++) {
        		if(bucket_min[i] == Integer.MAX_VALUE) continue;
        		else if(prev == -1) {
        			prev = i;
        			first = i;
        		}
        		else{
        		result = Math.max(result, bucket_min[i]-bucket_max[prev]);
        		prev = i;	        		
	        	}
	        }
        	if(prev == -1) return max-min;
        	result = Math.max(result, max - bucket_max[prev]);
        	result = Math.max(result, bucket_min[first]-min);
	        return result;
	    }
	 public static void main(String[] args){
		 int[] num = {3,6,10,1,18,50000,30000,10000};
		 System.out.println(maximumGap(num));
	 }
}
