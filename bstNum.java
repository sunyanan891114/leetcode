package leetcode;

public class bstNum {
	public static int numTrees(int n) {
		int result = 0;
		if(n == 0) return 1;
		for(int i = 0;i<n;i++){
			result = result + numTrees(i) * numTrees(n-i-1);
		}
		return result;
	}
	public static void main(String[] args){
		System.out.println(numTrees(4));
	}
}
