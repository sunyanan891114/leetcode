package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.DepthOfBinaryTree.TreeNode;

public class levelsearch {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		   Queue<TreeNode> queue = new LinkedList<TreeNode>();
		   Queue<Integer> node = new LinkedList<Integer>();
		   queue.offer(root);
		   List<List<Integer>> result = new ArrayList<List<Integer>>();
		   ArrayList<Integer> list = new ArrayList<Integer>();
		   node.offer(0);
		   TreeNode search ;
		   int layer = 0;
	        while(queue.size() != 0){
	        	list = new ArrayList<Integer>();
	        	search = queue.poll();
	        	layer = node.poll();
	        	result.add(list);
	        	result.get(layer).add(search.val);
	        	if(search.left != null ){
	        	queue.add(search.left);	     
	        	node.offer(layer+1);
	        	}
	        	if(search.right != null){
	        	queue.add(search.right);
	        	node.offer(layer+1);
	        	}
	        }
	        int i = 0;
	        while(i<result.size()){
	        	if(result.get(i).size() == 0){
	        		result.remove(i);
	        	}
	        	else i++;
	        }
	        return result;
	    }
	
	   public static void main(String[] args){
		   List<List<Integer>> result = new ArrayList<List<Integer>>();
			 TreeNode node1 = new TreeNode(1);
			 TreeNode node2 = new TreeNode(2);
			 TreeNode node3 = new TreeNode(3);
			 TreeNode node4 = new TreeNode(4);
			 TreeNode node5 = new TreeNode(5);
			 node1.left = node2;
			 node1.right = node3;
			 node2.left = node4;
			 node2.right = node5;
			 result = levelOrder(node1);
			 System.out.println(result);
		 }
}
