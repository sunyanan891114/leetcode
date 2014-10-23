package leetcode;

public class ClimbingStairs {
	 public static int climbStairs(int n) {
		 int[] result = new int[n+1];
		 result[1] = 1;
		 result[2] = 2;
		 for(int i = 3;i<=n;i++){		 
			 result[i] = result[i-1] + result[i-2];
		 }
		 return result[n];
	       
	    }
	 public static void main(String[] args){
		 System.out.println(climbStairs(44));
		 String s = "123";
		 Integer.parseInt(s);
	 }
}