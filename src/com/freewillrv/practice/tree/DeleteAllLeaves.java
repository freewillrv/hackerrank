package com.freewillrv.practice.tree;

public class DeleteAllLeaves {

	public boolean isLeafNode(Node node) {
		return node.right == null && node.left == null;
	}

	public void deleteLeafNodes(Node node) {
		if (node == null)
			return;
		if (isLeafNode(node.left)) {
			node.left = null;
		} else {
			deleteLeafNodes(node.left);
		}
		if (isLeafNode(node.right)) {
			node.right = null;
		} else {
			deleteLeafNodes(node.right);
		}
	}

}
