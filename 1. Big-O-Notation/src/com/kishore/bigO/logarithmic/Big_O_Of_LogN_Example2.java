package com.kishore.bigO.logarithmic;

public class Big_O_Of_LogN_Example2 {

	public static void main(String[] args) {
		logarithmic(8); // O(Log N) -> Logarithmic Time
	}

	/**
	 * Here in the below method we are multiply the i * 2, from our main method we
	 * are passing 8. Log base 2^8 = 3. So our result is 3 times loop will run.
	 * 
	 */
	public static void logarithmic(int x) {
		for (int i = 1; i < x; i = i * 2) {
			System.out.println(i);
		}
	}

}
