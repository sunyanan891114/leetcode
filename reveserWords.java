package leetcode;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reveserWords {
	 public  static String reverseWords(String s) {
		 Pattern p=Pattern.compile("[a-zA-Z0-9!?+-~@#$%^&*.<>;'\"]+");
			Matcher m=p.matcher(s);
			ArrayList<String> list=new ArrayList<String>();
			while(m.find()){
				list.add(m.group(0));
			}
			StringBuilder sb=new StringBuilder("");
			for(int i=list.size()-1;i>0;i--)
				sb.append(list.get(i)+" ");
			if(list.size()!=0)
				sb.append(list.get(0));
	    return sb.toString();
	 }
	 public static void  main(String[] args){
		 String s = "  the sky is    blue   ";
		 String result = reverseWords(s);
		 System.out.println(result.length());
		 System.out.println("\""+result+"\"");
	 }
	 
}/**
String[] splitS = s.split(" ");
int len = splitS.length;
String result ="";
System.out.println(len);
for(int i = 0;i<len;i++){		
	 System.out.println("\""+splitS[i]+"\"");
	 if(!splitS[len-i-1].equals(" ")&!splitS[len-i-1].equals("")&i!=0)
		result = result+" "+splitS[len-i-1];	
	 if(!splitS[len-i-1].equals(" ")&i==0)
		 result = splitS[len-i-1];
}


return result;*/