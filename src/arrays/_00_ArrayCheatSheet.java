package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		/*
		String[] things = {"hi", "what", "huh", "is", "this"};
		//2. print the third element in the array
		System.out.println(things[2]);
		//3. set the third element to a different value
		things[2] = "value";
		//4. print the third element again
		System.out.println(things[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (String thing:things) {
			System.out.println(thing);
		}
		*/
		//6. make an array of 50 integers
		int[] tegs = new int[50];
		int low = 50;
		int high = 1;
		int er = 0;
		//7. use a for loop to make every value of the integer array a random number
		for (int x=0; x<50; x++) {
			tegs[x] = x;
		}
		for (int x=0; x<50; x++) {
			Random gen = new Random();
			er = gen.nextInt(50)+1;

			tegs[x] = er;
			System.out.println(tegs[x]);
			
		//8. without printing the entire array, print only the smallest number in the array

			if (tegs[x]<low) {
				low = tegs[x];
			}
			if (tegs[x]>high) {
				high = tegs[x];
			}
		}
		System.out.println("this is lowest: " + low);
		System.out.println("this is highest: " + high);
		//9 print the entire array to see if step 8 was correct

		//10. print the largest number in the array.
	}
}
