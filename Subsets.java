package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public static List<List<Integer>> subsets(int[] S) {
		Arrays.sort(S);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> t = new ArrayList<Integer>();
		result.add(t);
		for(int i = 0;i<S.length;i++){
			int size = result.size();
			for(int j = 0;j<size;j++){
				List<Integer> m = new ArrayList<Integer>();
				for(int ii = 0;ii<result.get(j).size();ii++)
					m.add(result.get(j).get(ii));
				m.add(S[i]);
				result.add(m);
			}		
			//result.add(p);
		}
		return result;     
    }
	public static void main(String[] args){
		int[] S = {1,2,3};
		System.out.println(subsets(S));
	}
}
