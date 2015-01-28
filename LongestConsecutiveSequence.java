package leetcode;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public static int longestConsecutive(int[] num) {
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i = 0;i<num.length;i++){
			h.add(num[i]);
		}
		int result = 0;
		while(h.size() != 0){
			int max = 1;		
			int start = h.iterator().next();
			h.remove(start);
			int front = start;
			int back = start;
			while(h.contains(front+1)){				
				max++;
				h.remove(front+1);
				front = front + 1;
			}	
			while (h.contains(back-1)) {
				max++;
				h.remove(back-1);
				back = back - 1;
			}
			result = Math.max(result, max);
		}
		return result;
	}
	public static void main(String[] args){
		int[] num = {-1,0,1};
		System.out.println(longestConsecutive(num));
	}
        
    

	
}
