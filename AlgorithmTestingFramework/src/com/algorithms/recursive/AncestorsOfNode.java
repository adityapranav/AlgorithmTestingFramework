package com.algorithms.recursive;

public class AncestorsOfNode {

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
		
		System.out.println(printAncestors(seven, root));
	}
	
	public static boolean printAncestors(TreeNode node, TreeNode root) {
		if (root == null) { 
			return false;
		} else if (root == node) {
			return true;
		} else {
			boolean left=  printAncestors(node, root.left);
			boolean right = printAncestors(node, root.right);
			if (left) {
				System.out.println("Ancestor :"+ root.left.data);
				return true;
			} else if(right) {
				System.out.println("Ancestor :"+ root.right.data);
				return false;
			} else {
				return false;
			}
		}
		
	}

}