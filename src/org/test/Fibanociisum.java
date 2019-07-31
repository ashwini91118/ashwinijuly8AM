package org.test;

public class Fibanociisum {
	public static void main(String[] args) {
		int a = 0, b = 1, c, sum = 0;
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			a = b;
			b = c;
			sum = a + b + c;

		}
		System.out.println(sum);
	}

}
