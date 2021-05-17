package com.kishore.bigO.logarithmic;

public class Big_O_Of_LogN_Example1 {

	public static void main(String[] args) {
		logarithmic(20); // O(Log N) -> Logarithmic Time
	}

	/**
	 * Here in the below method we are passing i = 20, in the below while loop we
	 * are dividing the i/2 and initialize the value to i. It will divide by 2 till
	 * it reach 0.
	 * 
	 */
	public static void logarithmic(int i) {
		int j = 0;

		while (i > 0) {
			j += i;
			i /= 2;

			System.out.println(i);
		}
	}
}
