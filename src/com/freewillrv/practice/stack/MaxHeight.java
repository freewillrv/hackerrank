package com.freewillrv.practice.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//TODO WIP
public class MaxHeight {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String nosBuildings = br.readLine();
		final String[] heights = br.readLine().split("\\s+");

		Stack<Integer> buildings = new Stack<Integer>();
		Integer maxArea = Integer.MIN_VALUE;
		for (int i = 1; i <= heights.length; i++) {
			if (buildings.isEmpty()) {
				// Add the first height as max height for sure
				buildings.push(Integer.valueOf(heights[i - 1]));
				maxArea = 2 * (i + buildings.peek());
			} else if (true) // Max Area change
			{
				// Update the max Area + Stack Value
			}
		}

	}
}