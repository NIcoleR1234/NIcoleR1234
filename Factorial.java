/*
 CPS 161 MP2 
 Nicole Ramanathan
 */
package factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int num = 0, fact=1;
		char con = 'y';

		Scanner keyIn = new Scanner(System.in);

		while (con == 'y') {
			// Input
			System.out.print("Enter in the number:");
			num = keyIn.nextInt();
			fact=1;
			while(num>=1)
			{
				fact=fact*num;
				num=num-1;
						}
			System.out.println("Factorial:" + fact);
			// Process
			System.out.println("Do you want to go again? y or n ");
			con = keyIn.next().charAt(0);
			
		}
		
		System.out.println();
		keyIn.close();
	}
}
