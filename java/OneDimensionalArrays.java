package one_dimesional_array;

import java.util.Scanner;

public class OneDimensionalArrays {
	 int[] createIntegers(int size_of_array) {
		// ******* FILL IN CODE *********
		// Your code will create an array of ints as large as specified in size_of_array
		// Fill the array in with the values: 0, 100, 200, 300, ....
		// Return the array that you just created
		
		int[] hundreds= new int[size_of_array];
		
		for (int i=0; i<size_of_array; i++)
		{
			hundreds[i]=i*100;
		}
		
		return hundreds;
	}
	

	 void printArray(int[] myArray) {

//******* FILL IN CODE ********* 
		// Print out your array with one number per line. Get the size of
// array from the "myArray" parameter (no hard coding the size) 
		
		for (int i=0; i<myArray.length; i++)
		{
			System.out.println(myArray[i]);
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter size of array to create: ");
		int num = keyboard.nextInt();
		OneDimensionalArrays oda = new OneDimensionalArrays();
		int[] Arr=oda.createIntegers(num);
		oda.printArray(Arr);
		
		keyboard.close();
		
		
		

	}
}
