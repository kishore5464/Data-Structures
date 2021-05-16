package com.kishore.bigO.quadratic;

import java.util.Iterator;

import com.kishore.bigO.Constants;

public class Big_O_Of_N_Square_Example3 {

	public static void main(String[] args) {
		// Here this intArray i am calling from Constant Class which i wrote
		copyArray(Constants.sortedIntArray); // O(N^2) -> Linear Time
	}

	/**
	 * Here the time complexity is O(N^2). Because, when N is the number of elements
	 * in the sortedIntArray. The first call to appendToNewArray takes 1 copy, then
	 * 2nd call takes 2nd copy and goes on till Nth goes N copy. The total time will
	 * be the sum of 1 through N, which is (N^2)
	 */
	public static int[] copyArray(int[] sortedIntArray) {
		int[] copy = new int[0];

		for (int value : sortedIntArray) {
			copy = appendToNewArray(copy, value);
		}

		return copy;
	}

	public static int[] appendToNewArray(int[] copyArray, int value) {
		int[] biggerArray = new int[copyArray.length + 1];

		for (int i = 0; i < copyArray.length; i++) {
			biggerArray[i] = copyArray[i];
		}

		biggerArray[biggerArray.length - 1] = value;

		return biggerArray;
	}

}
