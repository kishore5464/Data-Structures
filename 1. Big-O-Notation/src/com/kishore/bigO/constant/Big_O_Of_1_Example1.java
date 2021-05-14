package com.kishore.bigO.constant;

import com.kishore.bigO.Constants;

public class Big_O_Of_1_Example1 {

	public static void main(String[] args) {

		// Here this stringArray i am calling from Constant Class which i wrote
		constant(Constants.stringArray1); // O(1) -> Constant Time
	}

	/**
	 * 
	 * Here in O(1) or Constant Time. It take stringArray1 (or) stringArray2 (or)
	 * stringArray3 and lets see how the time taken of the function is same
	 * 
	 * If i am passing stringArray1 the time take is same to stringArray2 and the
	 * same time is takes to stringArray3 also because we ask particular index in
	 * that array
	 * 
	 * It wont increase like O(n) when No.of Inputs increase then No.of Operation to
	 * increase, it follow Constant Time taken
	 * 
	 * --> IMPORTANT <--
	 * 
	 * If we are doing n No.of operation like O(2), O(10), O(100000) also, It will
	 * consider as O(1) because it consume as Constant Time
	 * 
	 **/
	// O(1) -> Constant Time
	public static void constant(String[] n) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < n.length; i++) {
			// Here we are passing the index no as 1
			System.out.println(n[1]); // So the No.of Operation is O(1)

			// Here we are doing so but different index as 3
			System.out.println(n[3]); // So the No.of Operation is O(1)
		}

		long end = System.currentTimeMillis();
		System.out.println("Time taken for O(1) -> " + (end - start) + " ms");
	}
}
