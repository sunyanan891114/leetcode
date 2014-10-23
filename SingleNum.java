package leetcode;

import java.util.HashSet;

public class SingleNum {
	public static int single(int[] a) {
		HashSet<Integer> num = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			int j = num.size();
			num.add(a[i]);  
			if (num.size() == j) {
				num.remove(a[i]);
			}
		}
		java.util.Iterator<Integer> it = num.iterator();
		return it.next();
	}
	
	public static int singleNumber(int[] A) {
		if(A.length == 1) return A[0];
        int j = 0;
        boolean flag = false;
        for(int i = 0;i<A.length;i++){
             flag = false;
        	for(j = 0;j<A.length;j++){
        	if(A[i] == A[j] & j != i) {
        	    flag = true;
        	break;    
        	}
        	}
        if(!flag) return A[i];
        }
        return 0;
    }
	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 5 };
		int result = singleNumber(a);
		System.out.println(result);
	}
}
