package leetcode;

public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		if(x < 0) x = Math.abs(x);
		StringBuilder str = new StringBuilder(Integer.toString(x));
		//Integer.parseInt(str.reverse().toString());
		return x == Integer.parseInt(str.reverse().toString());
	        
	    }
	public static void main(String[] args){
		int x = -2147483648;
		System.out.println(isPalindrome(x));
	}
}
