package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static List<List<Integer>> permute(int[] num) {
		if(num.length == 0) return null;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(num.length == 1){
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(num[0]);
			result.add(temp);
			return result;
		}
		int[] d = new int[num.length-1];
		for(int i = 0;i<num.length;i++){
			for(int j = 0;j<num.length;j++){
				if(j < i) d[j] = num[j];
				if(j > i) d[j-1] = num[j];
			}
			List<List<Integer>> result1 = permute(d);
			for(int index = 0;index<result1.size();index++){
				result1.get(index).add(num[i]);
				result.add(result1.get(index));
			}			
		}		
	        return result;
	    }
	public static void main(String[] args){
		int[] num ={1,2,3,4};
		System.out.println(permute(num));
	}
	

}
