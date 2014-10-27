package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import leetcode.sameTree.TreeNode;

public class BinaryTreeLevelOrderTraversalII {
	 public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
	        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
     if(root == null) return result;
     Queue<TreeNode> q1 = new LinkedList<TreeNode>();
	        Stack<Integer> s2 = new Stack<Integer>();
	        Queue<Integer> q2 = new LinkedList<Integer>();
	        Stack<TreeNode> s1 = new Stack<TreeNode>();
	        TreeNode temp ;
	        int layer = 0;
	        q1.offer(root);
	        q2.offer(0);
	        while(!q1.isEmpty()){
	        	temp = q1.poll();
	        	layer = q2.poll();
	        	s2.push(layer);
	        	s1.push(temp);
	        	if(temp.left != null || temp.right != null){
	        	    layer++;
	        	}
	        	if(temp.right != null){
		        	q2.offer(layer); 
		        	q1.offer(temp.right);
	        	}
	        	if(temp.left != null){
		        	q2.offer(layer);       	
		        	q1.offer(temp.left);
		        	}        	
	        }
	      
	        int com;
	        int tree;
	        while(!s1.isEmpty()){   
	        	com = s2.pop();
	        	tree = s1.pop().val;
	        	if(com == layer){
	        		list.add(tree);
	        	}
	        	else{
	        		result.add(list);
	        		layer = com;
	        		list = new ArrayList<Integer>();
	        		list.add(tree);
	        	}
	        }
	        result.add(list);
	        return result;
	    }
	 public  static void main(String[] args){
		 TreeNode tree1 = new TreeNode(1);
		 TreeNode tree2 = new TreeNode(2);
		 TreeNode tree3 = new TreeNode(3);
		 tree1.left = tree2;
		 tree1.right = tree3;
 		 System.out.println(levelOrderBottom(tree1));
	 }
}
