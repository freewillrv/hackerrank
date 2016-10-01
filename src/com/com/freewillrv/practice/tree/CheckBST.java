package com.com.freewillrv.practice.tree;

import java.util.ArrayList;
import java.util.List;

public class CheckBST {

	public static void inorder(Node root, List<Node> inorderList) throws Exception {
		if (root == null)
			return;
		inorder(root.left, inorderList);
		if (!inorderList.isEmpty()) {
			if (inorderList.get(0).data >= root.data) {
				throw new Exception("Invalid BST");
			}
			inorderList.add(0, root);
		}
		inorder(root.right, inorderList);
	}

	boolean checkBST(Node root) {
		List<Node> inorderTraversal = new ArrayList<Node>();
		inorderTraversal.add(new Node());
		inorderTraversal.get(0).data = Integer.MIN_VALUE;
		try {
			inorder(root, inorderTraversal);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
