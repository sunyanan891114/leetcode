package leetcode;

public class reverseInt {
	 public static int reverse(int x) {
		 if(x >= 0){
		 String str = Integer.toString(x);
		 StringBuilder s =new StringBuilder() ;
		 s.append(str);
		 s.reverse();
	        return Integer.parseInt(s.toString());
	        }
		 else {
			 x = Math.abs(x);
			 String str = Integer.toString(x);
			 StringBuilder s =new StringBuilder() ;
			 s.append(str);
			 s.reverse();
			 return 0 - Integer.parseInt(s.toString());
		 }
		 
	    }
	 public static void main(String[] args){
		 int x = -123;
		 System.out.println(reverse(x));
	 }
}
