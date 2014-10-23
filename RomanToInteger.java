package leetcode;

public class RomanToInteger {
	 public static int romanToInt(String s) {
		 int result = 0;
		 int[] num = new int[s.length()];
		 for(int i = 0;i < s.length();i++){			 
			 switch ( s.charAt(i)){
			 case('I'): num[i] = 1;break;
			 case('V'): num[i] = 5;break;
			 case('X'): num[i] = 10;break;
			 case('L'): num[i] = 50;break;
			 case('C'): num[i] = 100;break;
			 case('M'): num[i] = 1000;break;
			 case('D'): num[i] = 500;break;
			 }			 
		 }
		 for(int i = 0;i<s.length()-1;i++){
		
			 if(num[i] <= num[i+1] &( num[i] == 1| num[i] == 10| num[i] == 100)){
				 int factor = 0;
				 while(num[i] == num[i+1]){
					 i++;
					 factor++;		
					 if(i == s.length()-1) break;
				 }
			if(i == s.length()-1) return result + num[i]*(factor+1);
			if(num[i] < num[i+1])
			 result = result - num[i]*(factor+1);
			else result = result + num[i]*(factor+1);
			}
			 else
				 result = result + num[i];
	
		 }
		 
		 return result + num[s.length()-1];		 		 			 
		 }
	 public static void main(String[] args){
		 System.out.println(romanToInt("MDLXX"));
	 }
}
