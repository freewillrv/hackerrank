package com.freewillrv.practice.tree;

public class FindNosNodes {

	int getNosNodes(Node root) {
		if (root == null)
			return 0;
		return 1 + getNosNodes(root.left) + getNosNodes(root.right);
	}

}
