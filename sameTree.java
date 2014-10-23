package leetcode;


public class sameTree {
	 static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	 public static boolean isSameTree(TreeNode p, TreeNode q) {
		 	boolean flag1;
		 	boolean flag2;
		 	if(p == null & q == null) return true;
	        if(p == null | q == null ) return false;
	        if(p.val != q.val) return false;
	        flag1 = isSameTree(p.left, q.left);
	        flag2 = isSameTree(p.right, q.right);
	        return flag1&flag2;
	    }
}
