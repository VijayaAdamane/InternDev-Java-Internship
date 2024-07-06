package com.tasks;
import java.util.Scanner;
public class WordCount {

	public static int countWords(String text) {
		if (text == null || text.isEmpty()) {
			return 0;
		}
		String[] words = text.split("\\s+"); // Split using one or more whitespace characters
		return words.length;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Word Count Program : ");
		System.out.println("Enter the string  : ");
		String text = scanner.nextLine();
		int wordCount = countWords(text);
		System.out.println("Number of words: " + wordCount);
	}
}
