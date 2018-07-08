package com.algorithms.recursive;
class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class MaximumPathSumBinaryTree {

	public static int maximumPathSum(TreeNode root) {
		return maxPathS(root.left) + maxPathS(root.right) + root.data;
	}
	
	
	private static int maxPathS(TreeNode root) {
		if (root == null) {
			return 0;
		}
		else if (root.left == null && root.right == null) {
			return (root.data >= 0)? root.data : 0;
		} else {
			int l = maxPathS(root.left);
			int r = maxPathS(root.right);
			int d = root.data;
			int val = Math.max(l, r)+d;
			return ( val >= 0) ? val :0;
		}
		
	}


	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		TreeNode one  = new TreeNode(2);
		TreeNode two  = new TreeNode(10);
		TreeNode three  = new TreeNode(20);
		TreeNode four  = new TreeNode(1);
		TreeNode five  = new TreeNode(25);
		TreeNode six  = new TreeNode(3);
		TreeNode seven  = new TreeNode(4);
		
		root.left = one; root.right = two;
		one.left = three; one.right = four;
		two.right = five;
		five.left = six; five.right = seven;
		
		System.out.println(maximumPathSum(root));
		
		

	}

}
