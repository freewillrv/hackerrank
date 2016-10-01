package com.freewillrv.practice.tree;

public class TopView {
	void printLeft(Node root) {
		if (root == null)
			return;
		printLeft(root.left);
		System.out.print(root.data + " ");
	}

	void printRight(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		printRight(root.right);
	}

	void top_view(Node root) {
		printLeft(root.left);
		System.out.print(root.data + " ");
		printRight(root.right);
	}
}
