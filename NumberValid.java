package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NumberValid {
public static  boolean isNumber(String s) {
	if(s.length() == 0) return false;
	Pattern p=Pattern.compile("^\\s*[0-9]+e\\+?[0-9]+\\s*$");
	Matcher m=p.matcher(s);
	if(m.find()) return true;
	p = Pattern.compile("^\\s*[0-9]+\\.[0-9]+\\s*$");
	m = p.matcher(s);
	if(m.find()) return true;
	if(s.matches("^\\s*[0-9]+\\.\\s*$")) return true;
	if(s.matches("^\\s*\\.[0-9]+\\s*$")) return true;
	p = Pattern.compile("^\\s*[0-9]+\\s*$");
	m = p.matcher(s);
	if(m.find()) 
		return true;
	return false;
    }
public static void main(String[] args){
	System.out.println(isNumber(" 005047e+6"));
}
}
