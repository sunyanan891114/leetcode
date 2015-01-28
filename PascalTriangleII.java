package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	 public List<Integer> getRow(int rowIndex) {
		 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		 ArrayList<Integer> temp1 = new ArrayList<Integer>();
	        for(int i = 0;i < rowIndex;i++){
	        	temp1 = new ArrayList<Integer>();
	        	temp1.add(1);
	        	if(i>0){
	        	ArrayList<Integer> temp2 = result.get(i-1);
//	        	System.out.println(temp2);
	        	for(int j = 0;j < i-1;j++){
	        		temp1.add(temp2.get(j)+temp2.get(j+1));
//	        		System.out.println(temp1);
	        		}
	        	temp1.add(1);	        	
	        	}
	        	result.add(temp1);    
//	        	System.out.println(result);
	        }
	        return temp1;
	 }
	        
}
