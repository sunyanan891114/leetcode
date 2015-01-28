package leetcode;

import leetcode.listcircle.ListNode;

public class InsertionSortList {
	public static ListNode insertionSortList(ListNode head) {
		   if(head == null ||head.next==null) return head;
	       ListNode headptr = new ListNode(0);
	       headptr.next = head;
	       int sortnum = 1;
	       ListNode n = head;
	       
	       while(n.next != null){
	    	   ListNode m = headptr;
	    	   for(int i = 0;i<sortnum;i++){
	    		   if(m.next.val>n.next.val)
	    			   break;
	    		   m = m.next;
	    	   }
	    	   if(m.next.val>n.next.val){
	    		   ListNode sortnode = n.next;
	    		   n.next = n.next.next;
	    		   sortnode.next = m.next;
	    		   m.next = sortnode;
	    	   }
	    	   else n = n.next;
	    	   sortnum++;  
	    	   print(headptr.next);
	       }
	       return headptr.next;
	    }
	public static void print(ListNode head){
		while(head != null){
			System.out.print(head.val+" ");
			head = head.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(-2);
		node1.next = node3;
		node3.next = node4;
		node4.next = node2;
		
		ListNode head = insertionSortList(node1);
		print(head);
	}
}
