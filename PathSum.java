package leetcode;

import leetcode.sameTree.TreeNode;

public class PathSum {
	 public static boolean hasPathSum(TreeNode root, int sum) {
	       if(root == null) return false;
	       return isPathSum(root, root.val, sum);
	    }
	 public static boolean  isPathSum(TreeNode node,int add,int sum){
		 boolean flag= false;
		 if(node.left == null && node.right == null && add == sum){
			 flag = true;
			 return true;
		 }
		 if(node.left != null){
			 flag = isPathSum(node.left, add+node.left.val, sum);
			 if(flag) return true;
		 }
		 if(node.right != null){
			 flag = isPathSum(node.right, add+node.right.val ,sum);
			 if(flag) return true;
		 }	 
		return false;		 
	 }
	 public static void main(String[] args){
		 TreeNode node1 = new TreeNode(1);
		 TreeNode node2 = new TreeNode(2);
		 TreeNode node3 = new TreeNode(3);
		 TreeNode node4 = new TreeNode(4);
		 node1.left  = node2;
		 node1.right = node3;
		 node3.right = node4;
		 System.out.println(hasPathSum(node1,8));
		 System.getProperties().list(System.out);
	 }
	 
}
