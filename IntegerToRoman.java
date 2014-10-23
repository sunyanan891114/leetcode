package leetcode;

public class IntegerToRoman {
	 public static String intToRoman(int num) {
	        StringBuilder s  = new StringBuilder();
	        int i = 0;
	        while(num != 0){
	        	if((i = num/1000) != 0){
	        		num = num % 1000;
	        		while(i != 0){
	        		s.append('M');
	        		i--;}
	        	}
	        	if((i = num/100) != 0){	
	        		num = num % 100;
	        		if(i == 9) {s.append('C');s.append('M');i = 0;}
	        		if(i >= 5){s.append('D');i = i-5;}
	        		if(i == 4) {s.append('C');s.append('D');i = 0;}
	        		while(i != 0){
		        		s.append('C');
		        		i--;}
	        	}	        
	        	if((i = num/10) != 0){
	        		num = num % 10;
	        		if(i == 9) {s.append('X');s.append('C');i = 0;}
	        		if(i >= 5){s.append('D');i = i-5;}
	        		if(i == 4) {s.append('L');s.append('X');i = 0;}
	        		while(i != 0){
		        		s.append('X');
		        		i--;}
	        	}
	        	if((i = num/1) != 0){
	        		num = num % 1;
	        		if(i == 9) {s.append('I');s.append('X');i = 0;}
	        		if(i >= 5){s.append('V');i = i-5;}
	        		if(i == 4) {s.append('I');s.append('V');i = 0;}
	        		while(i != 0){
		        		s.append('I');
		        		i--;}
	        	}
	        	
	        		
	        }
	      return s.toString();  
	    }
	 public static void main(String[] args){
		 System.out.println(intToRoman(99));
	 }
}
