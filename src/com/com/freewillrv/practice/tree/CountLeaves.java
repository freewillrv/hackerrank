package com.com.freewillrv.practice.tree;

public class CountLeaves {

	public static int countLeaves(Node root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null) {
			return 1;
		}
		return countLeaves(root.left) + countLeaves(root.right);
	}

}
