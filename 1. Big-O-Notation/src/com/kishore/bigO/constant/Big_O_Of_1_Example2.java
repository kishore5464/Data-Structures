package com.kishore.bigO.constant;

public class Big_O_Of_1_Example2 {

	public static void main(String[] args) {

		// Here this stringArray i am calling from Constant Class which i wrote
		int value = constant(5, 6); // O(1) -> Constant Time
		System.out.println(value);
	}

	/**
	 * 
	 * Here in O(1) or Constant Time. Just doing 1 operations, it will return -1 or
	 * (n - div * m)
	 * 
	 **/

	public static int constant(int n, int m) {
		if (m <= 0) {
			return -1;
		}

		int div = n / m;
		return n - div * m;

	}
}
