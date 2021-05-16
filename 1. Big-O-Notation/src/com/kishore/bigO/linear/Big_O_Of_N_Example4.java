package com.kishore.bigO.linear;

public class Big_O_Of_N_Example4 {

	public static void main(String[] args) {
		int value = linear(5, 6); // O(n) -> Linear Time

		System.out.println(value);
	}

	/**
	 * Here in the below example the time complexity is O(N), Its just running till
	 * M times.
	 */

	private static int linear(int n, int m) {
		int sum = 0;

		for (int i = 0; i < m; i++) {
			sum += n;
		}

		return sum;
	}
}
