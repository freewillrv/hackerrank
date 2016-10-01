package com.freewillrv.practice.tree;

import java.util.ArrayList;
import java.util.List;

public class PrintNodesLevelWise {

	void addChildNodes(List<Node> nodes, Node n) {
		if (n == null)
			return;
		nodes.add(n);
	}

	void printChilds(List<Node> nodes) {
		if (nodes == null || nodes.isEmpty())
			return;
		Node root = nodes.get(0);
		nodes.remove(0);
		System.out.print(root.data + " ");
		addChildNodes(nodes, root.left);
		addChildNodes(nodes, root.right);
	}

	void LevelOrder(Node root) {
		if (root == null)
			return;
		List<Node> nodes = new ArrayList<Node>();
		nodes.add(root);
		while (!nodes.isEmpty())
			printChilds(nodes);
	}

}
