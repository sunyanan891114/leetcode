package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class MajorityElement {
	public static int majorityElement(int[] num) {
        int n = num.length;
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i = 0;i < n;i++){
        	if(m.get(num[i]) == null){
        		m.put(num[i], 1);
        	}
        	else{
        	int temp = m.get(num[i]);	
        	m.put(num[i], ++temp);
        	}
        }
        Iterator<Entry<Integer, Integer>> it = m.entrySet().iterator();
        int key = 0;
        int value = 0;
        while(it.hasNext()){
        	@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) it.next();
        	if((Integer)entry.getValue() > value){
        		key = (Integer) entry.getKey();
        		value = (Integer) entry.getValue();
        	}
        }
        return key;      
    }
	public static void main(String[] args){
		int[] num = {2,2,1};
		System.out.println(majorityElement(num));
	}

}
