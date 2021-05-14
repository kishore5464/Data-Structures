package com.kishore.bigO.linear;

import com.kishore.bigO.Constants;

public class Big_O_Of_N_Example1 {

	public static void main(String[] args) {
		// Here this stringArray i am calling from Constant Class which i wrote
		linear(Constants.stringArray1); // O(n) -> Linear Time
	}

	/**
	 * 
	 * Here in O(n) or Linear Time. It take stringArray1 (or) stringArray2 (or)
	 * stringArray3 and see how the efficiency of the function increase
	 * 
	 * If i am passing stringArray1 the time take is different to stringArray2 and
	 * this time taken is different to stringArray3 because of its No.of operations
	 * 
	 * If No.of Input increase then No.of Operations also increase, it follow to a
	 * Linear Time taken
	 *
	 **/
	// O(n) -> Linear Time
	public static void linear(String[] n) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < n.length; i++) {
			if (n[i].equals("Shantha")) {
				System.out.println(n[i]);
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("Time taken for O(n) -> " + (end - start) + " ms");
	}

}
