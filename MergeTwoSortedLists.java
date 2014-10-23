package leetcode;

public class MergeTwoSortedLists {
	static  class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        if(l1 == null) return l2;
	        if(l2 == null) return l1;
	        ListNode search1 = l1;
	        ListNode search2 = l2;
	        ListNode search;
	        if(search1.val < search2.val) {search = l1;search1 = search1.next;}
	        else {search = l2;search2 = search2.next;}
	        
	        while(search1!= null & search2!= null){
	        	if(search1.val <= search2.val){
	        		search.next = search1;
	        		search = search.next;
	        		search1 = search1.next;
	        	}
	        	else{
	        		search.next = search2;
	        		search = search.next;
	        		search2 = search2.next;
	        	}
	        }
	       if(search1 == null) search.next = search2;
	       if(search2 == null) search.next = search1;
	        if(l1.val < l2.val)  return l1;
	        else return l2;
	        
	    }
}
