package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		/*String [] friends = {"Alex", "Edward", "Gaby", "Anthony", "Alden"};
		
		//2. print the third element in the array
		System.out.println(friends[2]);
		//3. set the third element to a different value
		 friends[2] = "Peter";
		
		//4. print the third element again
			System.out.println(friends[2]);

		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0;i<friends.length;i++) {
			System.out.println(friends[i]);
		}*/

		
		//6. make an array of 50 integers
		Integer [] manyInts = new Integer [50];
		
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < manyInts.length; i++) {
			Random ran = new Random();
			int num = ran.nextInt(50);
			manyInts[i] = num;
		}
		//8. without printing the entire array, print only the smallest number in the array
/*int small = manyInts[0];
		for (int i = 0; i < manyInts.length; i++) {
			System.out.println(manyInts[i]);
			if (small > manyInts[i]) {
				small = manyInts[i];
			}

		}
		System.out.println(small + " is the smallest number");*/

		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int big = manyInts[0];
		for (int i = 0; i < manyInts.length; i++) {
			System.out.println(manyInts[i]);
			if (big < manyInts[i]) {
				big = manyInts[i];
			}

		}
		System.out.println(big + " is the biggest number");
	}
}
