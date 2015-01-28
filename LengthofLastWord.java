package leetcode;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LengthofLastWord {
	public static int lengthOfLastWord(String s) {		
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m  = p.matcher(s);
        ArrayList<String> result = new ArrayList<String>();
        int mm = 0;
        while(m.find()){
        	for(int i = 0;i <= m.groupCount();i++){
        		//System.out.println("m.group " + i +" is " + m.group(i)+".");
        		result.add(m.group(i));
        		mm++;
        	}   
        	//return m.group(m.groupCount()).length();
        }
        if(result.size() == 0) return 0;
        //System.out.println(result.get(mm-1));
        return result.get(mm-1).length();
        
    }
	public static void main(String[] args){
		String s = "abcbbgf asdghmm a";
		System.out.println(lengthOfLastWord(s));
	}
}
