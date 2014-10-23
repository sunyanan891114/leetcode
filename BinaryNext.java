package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNext {
	public static class TreeLinkNode {
		      int val;
		      TreeLinkNode left, right, next;
		      TreeLinkNode(int x) { val = x; }
		  }
	 public static void connect(TreeLinkNode root) {
	        Queue<TreeLinkNode> tree = new LinkedList<TreeLinkNode>();
	        ArrayList<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
	        double layer = 1;
	        if(root != null){
	        	tree.offer(root);
	        	while(tree.size() != 0){
	        		TreeLinkNode search = tree.poll();
	        		list.add(search);
	        		if(search.left != null & search.right != null){
	        		tree.offer(search.left);
	        		tree.offer(search.right);}
	        	}
	        	for(int i = 0;i<list.size()-1;i++){
	        		if(i == (int)(Math.pow(2, layer)-2)){
	        			list.get(i).next = null;
	        		//	System.out.println((int)((Math.pow(2, layer)-2)));
	        			System.out.println(list.get(i).val +" next is   null");
	        			layer++;
	        		}
	        		else{
	        			list.get(i).next = list.get(i+1);
	        			System.out.println(list.get(i).val +" next is   "+list.get(i).next.val);
	        		}
	        	}
	        	list.get(list.size()-1).next = null;	        		        	
	        }
	    }
	public static void main(String[] args){
		TreeLinkNode node1 = new TreeLinkNode(0);
		TreeLinkNode node2 = new TreeLinkNode(1);
		TreeLinkNode node3 = new TreeLinkNode(2);
		TreeLinkNode node4 = new TreeLinkNode(3);
		TreeLinkNode node5 = new TreeLinkNode(4);
		TreeLinkNode node6 = new TreeLinkNode(5);
		TreeLinkNode node7 = new TreeLinkNode(6);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		System.out.println(node1.next);
		connect(node1);
		System.out.println(node7.next);
	}
}
