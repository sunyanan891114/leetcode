package leetcode;

import java.util.ArrayList;
import java.util.List;

import leetcode.DepthOfBinaryTree.TreeNode;

public class SearchTree {
public static List<Integer> preorderTraversal(TreeNode root) {
	List<Integer> list = new ArrayList<Integer>();
	if(root != null) {
		list.add(root.val);
		list.addAll(preorderTraversal(root.left));
		list.addAll(preorderTraversal(root.right));
	}
	return list;
    }
public static List<Integer> postorderTraversal(TreeNode root) {
	List<Integer> list = new ArrayList<Integer>();
	if(root != null) {
		list.addAll(postorderTraversal(root.left));
		list.addAll(postorderTraversal(root.right));
		list.add(root.val);
	}
	return list;
}
public static void main(String[] args){
	TreeNode node1 = new TreeNode(1);
	 TreeNode node2 = new TreeNode(2);
	 TreeNode node3 = new TreeNode(3);
	 node1.left = node2;
	 node2.left = node3;
	 List<Integer> result = new ArrayList<Integer>();
	 result = postorderTraversal(node1);
	 System.out.println(result);
}
}
