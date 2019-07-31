package org.test;

public class Countofdigits {
	public static void main(String[] args) {
		int a = 12345, count = 0;
		while (a > 0) {
			a = a / 10;
			count++;

		}
		System.out.println(count);
	}

}
