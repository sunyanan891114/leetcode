package leetcode;

import leetcode.listcircle.ListNode;

public class RemoveNthNodeFromEndofList {
	 public static ListNode removeNthFromEnd(ListNode head, int n) {
		 if(head == null) return null;
		 if(n == 0) return head;
		 int length = 1;
		 ListNode list = head;
		 while(list.next != null){
			 list = list.next;
			 length++;
		 }
		 list = head;
		 if( length == n){
			 list = head.next;
			 return list;
		 }
		 for(int i = 1;i<length-n;i++){
			 list = list.next;
		 }
		 if(n == 1){
			 list.next = null;
			 return head;
		 }
		 list.next = list.next.next;
		 return head;		 
	    }
	 public static void main(String[] args){
		 ListNode node1 = new ListNode(1);
		 ListNode node2 = new ListNode(2);
		 ListNode node3 = new ListNode(3);
		 node1.next = node2;
		 node2.next = node3;
		 ListNode head = node1;
		 head = removeNthFromEnd(head, 3);
		 while(head != null){
		 System.out.println(head.val);
		 head = head.next;
		 }
		 
	 }
}
