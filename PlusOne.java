package leetcode;

import java.util.Arrays;



public class PlusOne {
	 public static int[] plusOne(int[] digits) {   
				digits[digits.length-1]++;				
				for(int j = 0;j<digits.length;j++){
				       if(digits[digits.length-1-j] >= 10){
					        digits[digits.length-j-1] = 0;		 
					        if(digits.length-2-j >= 0)
					        	digits[digits.length-2-j] ++;
					        else{
					        	digits = Arrays.copyOf(digits, digits.length + 1 );
					        	for(int i = 0;i < digits.length-1;i++)
					        		digits[digits.length-i-1] = digits[digits.length-i-2];
					        	digits[0] = 1;
					        }					        	
				       }
				}
		     return digits;			 		 	     
	    }
	 public static void main(String[] args){
		 int[] digits = {9};
		 digits = plusOne(digits);
		 for(int i = 0;i<digits.length;i++)
		 System.out.println(digits[i]);
	 }
}
