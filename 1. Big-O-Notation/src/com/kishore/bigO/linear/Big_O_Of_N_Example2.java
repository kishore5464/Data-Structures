package com.kishore.bigO.linear;

import com.kishore.bigO.Constants;

public class Big_O_Of_N_Example2 {

	public static void main(String[] args) {

		// Here this intArray i am calling from Constant Class which i wrote
		linear(Constants.intArray1); // O(n) -> Linear Time
	}

	/**
	 * Here in the below example the time complexity is O(N), the fact that we
	 * iterate through the array twice doesn't matter
	 */

	private static void linear(int[] intArray) {
		int sum = 0;
		int product = 1;

		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}

		for (int j = 0; j < intArray.length; j++) {
			product *= intArray[j];
		}

		System.out.println(sum + " " + product);
	}
}
