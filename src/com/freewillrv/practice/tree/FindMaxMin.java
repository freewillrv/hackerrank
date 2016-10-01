package com.freewillrv.practice.tree;

public class FindMaxMin {

	/**
	 * 
	 * @param node
	 * @param max
	 * @param min
	 * @return
	 */
	public static void inorder(Node node, Integer max, Integer min) {
		if (node == null) {
			return;
		}
		inorder(node, max, min);
		// This is the node where comparision should take place in case of BST
		// Stop Check for Min at the first call here & Have seperate method for
		// max to opimize
		if (node.data > max) {
			max = node.data;
		}
		if (node.data < max) {
			min = node.data;
		}
		inorder(node.right, max, min);
	}

	/**
	 * 
	 * This function prints find Max & Min for a Tree. ( Not a BST)
	 * 
	 *
	 */
	public static void printMaxMin(Node root) {
		Integer max = Integer.MIN_VALUE;
		Integer min = Integer.MAX_VALUE;
		inorder(root, max, min);
		System.out.println(" Max- " + max + "Min- " + min);
	}

}
