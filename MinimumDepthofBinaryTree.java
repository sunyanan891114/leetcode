package leetcode;

import leetcode.sameTree.TreeNode;

public class MinimumDepthofBinaryTree {
	 public static int minDepth(TreeNode root) {
	        if(root == null) return 0;
	        else if(root.left == null && root.right == null) return 1;
	        else if(root.left != null && root.right == null) return minDepth(root.left)+1;
	        else if(root.left == null && root.right != null) return minDepth(root.right)+1;
	        else {
	        	int left = minDepth(root.left);
	        	int right = minDepth(root.right);
		        return (left<=right ? left:right)+1;
	        }
	        
	    }
	 public static void main(String[] args){
		 int result = 0;     
		 TreeNode node1 = new TreeNode(1);
		 TreeNode node2 = new TreeNode(2);
		 TreeNode node3 = new TreeNode(3);
		 node1.right = node2;
		 //node1.left = node3;
		 result = minDepth(node1);
		 System.out.println(result);
	 }
}
