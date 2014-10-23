package leetcode;

import java.util.HashSet;

public class listcircle {
	static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		      val = x;
		      next = null;
		      }
		  }
	public static boolean hasCycle(ListNode head) {
		HashSet<ListNode> search = new HashSet<ListNode>();
		int i = 0;
		int j = 0;
		while(head != null){
			i = search.size();
			search.add(head);
			j = search.size();
			if(i == j){
				return true;
			}
			head = head.next;
		}
		return false;
	}
	public static boolean hasCycle1(ListNode head){
		if(head == null ){
			return false;
		}
		if(head.next == null) return false;
		ListNode node1 = head;
		ListNode node2 = head;
		while(true){
			if(node1.next == node2.next.next){
				return true;
			}
			if(node1.next == null ) return false;
			if(node2.next == null) return false;
			if(node2.next.next == null) return false;
			node1 = node1.next;
			node2 = node2.next.next;
		}
	}
	public static void main(String[] args){
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node1.next = node2;
		node2.next = node1;
		System.out.println(hasCycle1(node1));
	}
}
