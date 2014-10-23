package leetcode;

import leetcode.sameTree.TreeNode;

public class SymmetricTree {
	 public boolean isSymmetric(TreeNode root) {
		 if(root == null) return true;
	        return isMirrorTree(root.left,root.right);
	    }
	 public static boolean isMirrorTree(TreeNode p, TreeNode q) {
		 	boolean flag1;
		 	boolean flag2;
		 	if(p == null & q == null) return true;
	        if(p == null | q == null ) return false;
	        if(p.val != q.val) return false;
	        if(p.left != null && p.right != null){
		        flag1 = isMirrorTree(p.left, q.left);
		        flag2 = isMirrorTree(p.right, q.right);}
	        else{
	        	flag1 = isMirrorTree(p.left, q.right);
	 	        flag2 = isMirrorTree(p.right, q.left);
	        }
	        return flag1&flag2;
	    }
}
