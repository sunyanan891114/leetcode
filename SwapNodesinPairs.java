package leetcode;

import leetcode.listcircle.ListNode;

public class SwapNodesinPairs {
	 public static ListNode swapPairs(ListNode head) {
	        if(head == null) return head;
	        if(head.next == null) return head;
	        ListNode search1 = head;
	        ListNode search2 = head;;
	        int i = 0;
	        while(search1 != null){
	        	if(i%2 == 0){
	        		if(search1.next != null & i != 0){
	        			search2.next = search1.next;
	        		}
	        		search2 = search1;
	        		search1 = search1.next;
	        		i++;
	        	}
	        	else{
	        		search2.next = search1.next;
	        		search1.next = search2;
	        		search1 = search2.next;
	        		i++;
	        	}
	        	if(i == 1) head = search1;
	        }
	        return head;
	    }
	 public static void main(String[] args){
			ListNode node1 = new ListNode(1);
			ListNode node2 = new ListNode(2);
			ListNode node3 = new ListNode(3);
			ListNode node4 = new ListNode(4);
			ListNode node5 = new ListNode(5);
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			//node5.next = node6;
			ListNode search = swapPairs(node1);
			while(search != null){
				System.out.println(search.val);
				search = search.next;
			}
		}
}
