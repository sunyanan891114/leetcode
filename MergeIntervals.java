package leetcode;

import java.util.ArrayList;
import java.util.List;

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }

public class MergeIntervals {
	public static List<Interval> merge(List<Interval> intervals) {
		boolean flag = false;
		int n = intervals.size();
		if(n<2) return intervals;
		List<Interval> t = new ArrayList<Interval>();
		for(int i = 0;i<intervals.size();i++){
			for(int j = 0;j<intervals.size();j++){
				if(j == i) continue;
				t = merge(intervals.get(i),intervals.get(j));
				if(t.size() == 1){
					intervals.set(i, t.get(0));
					intervals.remove(j);
					flag = true;
					j--;		
				} 
			}
			if(flag) i = -1;
			flag = false;
		}
			
	    return intervals;
	    
	}
	public static List<Interval> merge(Interval i1,Interval i2){
		Interval r;
		List<Interval> result = new ArrayList<Interval>();
		if(i1.start >= i2.start && i1.start <= i2.end ){
			r = new Interval(i2.start,Math.max(i1.end, i2.end));
			result.add(r);
		}
		else if(i2.start >= i1.start && i2.start <= i1.end ){
			r = new Interval(i1.start,Math.max(i1.end, i2.end));
			result.add(r);
		}
		else{
			result.add(i1);
			result.add(i2);
		}
		return result;					
	}
	public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		   if(intervals.size() == 0){
			   intervals.add(newInterval);
			   return intervals;
		   }
		   int i = 0;
	       for(i = 0;i<intervals.size();i++){
	    	   if(newInterval.start < intervals.get(i).start)break;
	       }
	       intervals.add(i, newInterval);	 
	       List<Interval> r = new ArrayList<Interval>();
	       r.add(intervals.get(0));
	       List<Interval> t = new ArrayList<Interval>();
	       for(i = 1;i<intervals.size();i++){
	    	   t = merge(r.get(r.size()-1),intervals.get(i));
	    	   if(t.size() == 1){
	    		   r.remove(r.size()-1);
	    		   r.addAll(t);
	    	   }
	    	   else{
	    		   r.add(intervals.get(i));
	    	   }
	       }
	       return r;
	     
	    }
	public static void main(String[] args){
		Interval i1 = new Interval(3,5);
		Interval i2 = new Interval(0,0);
		Interval i3 = new Interval(4,4);
		Interval i4 = new Interval(0,2);
		Interval i5 = new Interval(5,6);
		Interval i6 = new Interval(3,5);
		Interval i7 = new Interval(4,5);
		Interval i8 = new Interval(1,3);
		Interval i9 = new Interval(4,6);
		Interval i10 = new Interval(4,6);
		Interval i11 = new Interval(3,4);
		List<Interval> intervals = new ArrayList<Interval>();
		//intervals.add(i1);
		//intervals.add(i2);
		//intervals.add(i3);
		//intervals.add(i4);
		//intervals.add(i5);	
		//intervals.add(i6);
		//intervals.add(i7);
		//intervals.add(i8);
		//intervals.add(i9);
		//intervals.add(i10);
		//intervals.add(i11);
		//intervals = merge(intervals);
		intervals = insert(intervals,i6);
		for(int i = 0;i<intervals.size();i++){
		System.out.println(intervals.get(i).start+" "+intervals.get(i).end);
		}
	}
}
