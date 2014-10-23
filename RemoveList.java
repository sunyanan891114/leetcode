package leetcode;

public class RemoveList {
	static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	  public static ListNode deleteDuplicates(ListNode head) {
	        if(head == null) return head;
	        if(head.next == null) return head;
	        ListNode search = head;
	        while(search != null){
	        	if(search.next == null) return head;
	        	else{
	        		if(search.val == search.next.val){
	        			if(search.next.next == null) search.next = null;
	        			else search.next = search.next.next;
	        		}
	        		else
	        		search = search.next;
	        	}
	        }
	        return head;
	    }
	  public static void main(String[] args){
		  ListNode node1 = new ListNode(1);
		  ListNode node2 = new ListNode(1);
		  ListNode node3 = new ListNode(1);
		  ListNode node4 = new ListNode(4);
		  node1.next = node2;
		  node2.next = node3;
		  node3.next = node4;
		  deleteDuplicates(node1);
		  System.out.println(node4.next.val);
		  
	  }
}
