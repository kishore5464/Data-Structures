package com.kishore.bigO.linear;

public class Big_O_Of_N_Example3 {

	public static void main(String[] args) {
		int value = linear(5); // O(n) -> Linear Time

		System.out.println(value);
	}

	/**
	 * Here in the below example the time complexity is O(N), Its just recursion
	 * from N -> N-1 -> N-2 down to 1.
	 */

	private static int linear(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else {
			return n * linear(n - 1);
		}
	}
}
