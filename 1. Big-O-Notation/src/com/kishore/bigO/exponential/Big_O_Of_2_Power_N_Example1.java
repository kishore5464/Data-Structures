package com.kishore.bigO.exponential;

import com.kishore.bigO.Constants;

public class Big_O_Of_2_Power_N_Example1 {

	public static void main(String[] args) {

		// Here this stringArray i am calling from Constant Class which i wrote
		exponential(Constants.charArray2); // O(2^N) -> Exponential Time
	}

	/**
	 * Here in the below method, we are starting from right, 1 at i'th position
	 * shows that the i'th element of the set is present as 0 shows that the element
	 * is absent. Therefore, what we have to do is just generate the binary numbers
	 * from 0 to 2^n – 1, where n is the length of the set or the numbers of
	 * elements in the set.
	 * 
	 */
	public static void exponential(char[] charArray) {
		for (int i = 0; i < (1 << charArray.length); i++) {
			System.out.print("[ ");

			for (int j = 0; j < charArray.length; j++) {
				if ((i & (1 << j)) > 0) {
					System.out.print(charArray[j] + " ");
				}
			}
			System.out.println("]");
		}
	}
}
