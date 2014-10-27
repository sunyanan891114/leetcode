package leetcode;


import java.util.ArrayList;

public class GenerateParentheses {
	 public static ArrayList<String> generateParenthesis(int n) {
	      int left = n;
	      int right = n;
	      ArrayList<String> result = new ArrayList<String>();
	      generate(left, right, "",result);
	    return   result;
	    }
	 public static void generate(int left,int right,String s,ArrayList<String> result){
		 if(right < left ) return;
		 else if(right == 0 && left == 0){
			 result.add(s);
			 return;
			 //System.out.println("s is " + s);
			// System.out.println("result is " + result);
		 }
		 else if(left == 0 ) {			
			generate(left, --right, s+")",result);
			return;
		 }
		 	
			 generate(left-1, right, s+"(",result);
			 generate(left, right-1, s+")",result);			 
		 
	 }
	 public static void main(String[] artgs){
		 System.out.println(generateParenthesis(3));
	 }
}
