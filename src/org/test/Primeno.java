package org.test;

public class Primeno {
	public static void main(String[] args) {
		int n = 5, count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count = count + i;
				break;
			}

		}
		if (count == 0) {
			System.out.println("prime no");

		} else {
			System.out.println("not a prime no");
		}
	}
}