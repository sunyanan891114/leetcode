package leetcode;

import java.util.ArrayList;

public class PascalTriangle {
public  static ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i < numRows;i++){
        	ArrayList<Integer> temp1 = new ArrayList<Integer>();
        	temp1.add(1);
        	if(i>0){
        	ArrayList<Integer> temp2 = result.get(i-1);
        	System.out.println(temp2);
        	for(int j = 0;j < i-1;j++){
        		temp1.add(temp2.get(j)+temp2.get(j+1));
        		System.out.println(temp1);
        		}
        	temp1.add(1);
        	
        	}
        	result.add(temp1);    
        	System.out.println(result);
        }
        return result;
        
    }

public static void main(String[] args){
	System.out.println(generate(7));
}
}
