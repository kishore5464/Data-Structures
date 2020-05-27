package com.kishore.bigO;

public class Big_O_Notation {

	public static void main(String[] args) {
		// String[] stringArray1 = { "Kishore" };
		// String[] stringArray2 = { "Kishore", "Roshini", "Arumugam", "Shantha",
		// "Akshitha", "Sudha", "YuvaSri" };
		String[] stringArray3 = new String[1000];
		for (int i = 0; i < stringArray3.length; i++) {
			stringArray3[i] = "Kishore";
		}

		linear(stringArray3); // O(n) -> Linear Time

		constant(stringArray3); // O(1) -> Constant Time

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
			if (n[i].equals("Kishore")) {
				System.out.println(n[i]);
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("Time taken for O(n) -> " + (end - start) + " ms");
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

			// Here we are doing so but differnet index as 3
			System.out.println(n[3]); // So the No.of Operation is O(1)
		}

		long end = System.currentTimeMillis();
		System.out.println("Time taken for O(1) -> " + (end - start) + " ms");
	}
}
