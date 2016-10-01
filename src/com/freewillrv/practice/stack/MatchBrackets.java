package com.freewillrv.practice.stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class MatchBrackets {

	public static char getComplimentary(final char endBracket) {
		if (endBracket == ')')
			return '(';
		if (endBracket == '}')
			return '{';
		return '[';
	}

	public static String checkBalanced(final String brackets) {
		Stack<Character> stack = new Stack<Character>();
		if (brackets.length() % 2 != 0)
			return "NO";
		for (int i = 0; i < brackets.length(); i++) {
			char c = brackets.charAt(i);
			switch (c) {
			case '[':
			case '{':
			case '(':
				// Push Cases.
				stack.push(c);
				break;
			case ']':
			case '}':
			case ')':
				// Pop Cases
				try {
					if (stack.peek() != getComplimentary(c)) {
						return "NO";
					}
				} catch (EmptyStackException e) {
					return "NO";
				}
				// Pop the element
				stack.pop();
				break;
			default:
				return "NO";

			}
		}

		return stack.isEmpty() ? "YES" : "NO";
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		// 629
		String directory = "D:/Workspaces/Java_8_Lab/Java_8_Experiments/src/com/freewillrv/hackerrank/brackets/";
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(directory + "input12.txt")));
		FileWriter fw = new FileWriter(new File(directory + "outputNew.txt"), false);
		for (int a0 = 0; a0 < t; a0++) {
			// String s = in.next();
			String s = br.readLine();
			// System.out.println(checkBalanced(s));
			fw.write(checkBalanced(s) + "," + s + "\r\n");
		}
		in.close();
		fw.close();
		br.close();
	}

}
