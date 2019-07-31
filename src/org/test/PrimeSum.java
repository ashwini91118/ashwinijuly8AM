package org.test;

public class PrimeSum {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		for (int n = 2; n <= 100; n++) {
			num = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					num++;
					break;

				}

			}
			if (num == 0) {
				sum = sum + n;

			}

		}
		System.out.println(sum);
	}

}
