package leetcode;

import leetcode.listcircle.ListNode;

public class SortList {
	public static ListNode sortList(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode mid = getMid(head);
		ListNode h1 = head;
		ListNode h2 = mid.next;
		mid.next = null;				
		h1 = sortList(h1);
		h2 = sortList(h2);
	    return merge(h1,h2);
	    }
	public static ListNode getMid(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode p = head;
		ListNode q = head;
		while(p.next!=null && q.next != null && q.next.next != null){
			p = p.next;
			q = q.next.next;
		}
		return p;
	}
	public static ListNode merge(ListNode h1,ListNode h2){
		ListNode p = h1;
		ListNode q = h2;	
		ListNode it;
		ListNode head;
		//System.out.println("merge h1 is");
		//print(h1);
		//System.out.println("merge h2 is");
		//print(h2);
		if(p == null) return h2;
		if(q == null) return h1;
		if(p.val <= q.val){
			it = p;
			p = p.next;
			head = it;
		}		 
		else{
			 it = q;
			 q = q.next;
			 head = it;
		}
		while( p != null || q != null){
			if(p == null){
				it.next = q;
				it = it.next;
				q = q.next;
			}
			else if(q == null){
				it.next = p;
				it = it.next;
				p = p.next;
			}
			else if(p.val <= q.val){
				it.next = p;
				it = it.next;
				p = p.next;
			}
			else {
				it.next = q;
				it = it.next;
				q = q.next;
			}
		}
		//print(head);
		return head;
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
		ListNode node5 = new ListNode(0);
		node1.next = node3;
		node3.next = node4;
		node4.next = node2;
		node2.next = node5;
		print(node1);
		ListNode head = sortList(node1);
		print(head);
	}
}
