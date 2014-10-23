package leetcode;

public class ConvertSortedArraytoBinarySearchTree {
	static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	  public static TreeNode sortedArrayToBST(int[] num) {
	        if(num.length == 0) return null;
	        if(num.length == 1) return new TreeNode(num[0]);
	        int midpoint = num.length/2;
	        TreeNode root = new TreeNode(num[midpoint]);
	        TreeNode search = root;
	        int left[]  = new int[midpoint];
	        for(int i =0;i<midpoint;i++){
	        	left[i] = num[i];
	        }
	        search.left = sortedArrayToBST(left);
	        int j = 0;
	        int right[] = new int[num.length - midpoint -1];
	        for(int i = midpoint+1;i<num.length;i++){
	        	right[j] = num[i];
	        	j++;
	        }
	        search.right = sortedArrayToBST(right);
	        return root;
	    }
}
