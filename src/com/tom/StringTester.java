package com.tom;

import java.util.ArrayList;
import java.util.Scanner;

public class StringTester {

	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = new String("Hello World");
		System.out.println(s1 == "Hello World");
		System.out.println(s1.equals("Hello World"));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		Scanner s3 = new Scanner(System.in);
		// System.out.println(s1 == s3.nextLine());
		// System.out.println(s1.equals(s3.nextLine()));

		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1, 4)); // 1~3
		// 將s1倒過來
		ArrayList ar = new ArrayList();
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.println(s1.charAt(i));
			// ar.add(s1.charAt(i));

		}

		String s4 = "Jack Tom Eric Tom ....";
		String name = "boss";
		String result = null;
		// TODO:把字串中的Tom都改成boss

		for (int i = 0; i <= s4.length() - 1; i++) {
			if (s4.charAt(i) == 'T' && s4.charAt(i + 1) == 'o' && s4.charAt(i + 2) == 'm') {
				result = s4.substring(0, i) + name + s4.substring(i + 3);
			}
		} // 有問題
			// 用while
		System.out.println(result);
		
	int n = Integer.parseInt("100");
	float f = Float.parseFloat("99.9");
	
	}

}
