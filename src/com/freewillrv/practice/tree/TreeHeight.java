package com.freewillrv.practice.tree;

public class TreeHeight {

	int height(Node root) {
		if (root == null || (root.left == null && root.right == null)) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right)) + 1;
	}

}
