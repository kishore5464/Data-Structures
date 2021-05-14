package com.kishore.bigO.quadratic;

import com.kishore.bigO.Constants;

public class Big_O_Of_N_Square_Example2 {

	public static void main(String[] args) {
		// Here this intArray i am calling from Constant Class which i wrote
		quadratic(Constants.sortedIntArray); // O(N^2) -> Linear Time
	}

	/**
	 * Here the time complexity is O(N^2)
	 */
	public static void quadratic(int[] sortedIntArray) {

		for (int i = 0; i < sortedIntArray.length; i++) {
			for (int j = 0; j < sortedIntArray.length; j++) {
				System.out.println(sortedIntArray[i] + ", " + sortedIntArray[j]);
			}
		}
	}

}
