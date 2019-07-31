package org.test;

public class SumofDigits {
	public static void main(String[] args) {
		int a = 12345, sum = 0, i = 0;
		while (a > 0) {
			i = a % 10;
			sum = sum + i;
			a = a / 10;
		}
		System.out.println(sum);
	}

}
