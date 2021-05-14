package com.kishore.bigO.quadratic;

import com.kishore.bigO.Constants;

public class Big_O_Of_N_Square_Example1 {

	public static void main(String[] args) {
		// Here this intArray i am calling from Constant Class which i wrote
		quadratic(Constants.sortedIntArray); // O(N^2) -> Linear Time
	}

	/**
	 * Here in the below method, we are using for loop inside another for loop.
	 * 
	 * This pattern of for loop is very common. Its important that you know the
	 * runtime and that you deeply understand it. We can't rely on just memorizing
	 * runtime. Deep comprehension is important.
	 * 
	 * We know that the outer loop runs N times. How much does the inner loop do? It
	 * varies across iterations, but we can think about the average iteration.
	 * 
	 * Eg.) We have 10 elements then the average value is middle 10/2 = 5, same like
	 * if we pass N then the average value is N/2 = N/2(Half Of N)
	 * 
	 * 
	 * So. the time complexity is O(N^2)
	 */
	public static void quadratic(int[] sortedIntArray) {

		for (int i = 0; i < sortedIntArray.length; i++) {
			for (int j = i + 1; j < sortedIntArray.length; j++) {
				System.out.print(sortedIntArray[i] + ", " + sortedIntArray[j] + "\t");
			}
			System.out.println();
		}
	}

}
