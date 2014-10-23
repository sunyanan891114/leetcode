package leetcode;

import java.util.ArrayList;

public class GenerateParentheses {
	 public ArrayList<String> generateParenthesis(int n) {
	        int flag = 0;
	        ArrayList<String> result = new ArrayList<String>();
	        String temp = "(";
	        flag++;
	        
	        for(int i = 1;i<2*n-1;i++){
	        	if(flag>0){
		        	temp = temp + ")";
		        	flag--;
	        	}
	        	else{
	        		temp  = temp +"(";
	        		flag++;
	        	}
	        }
	        temp = temp + ")";
	        result.add(temp);
	    return result;   
	    }
}
