package leetcode;



public class DepthOfBinaryTree {
	/**
	public static int maxDepth(TreeNode t) {
		if(t != null){
			max ++;
			maxDepth(t.left);
			maxDepth(t.right);			
		}
		else{
			result = result>max? result:max;
			max--;
		}
		return result;
	}*/
	public  static int maxDepth(TreeNode t) {
		if(t == null) return 0;
		int depth1;
		int depth2;
		depth1 = maxDepth(t.left);
		depth2 = maxDepth(t.right);
		if(depth1>depth2){
		    return depth1 + 1;}
		else {
		    return depth2 + 1;}
	}
	 static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	 public static void main(String[] args){
		 int result = 0;
		 TreeNode node1 = new TreeNode(1);
		 TreeNode node2 = new TreeNode(2);
		 TreeNode node3 = new TreeNode(3);
		 node1.right = node2;
		 node2.left = node3;
		 result = maxDepth(node1);
		 System.out.println(result);
	 }
}
