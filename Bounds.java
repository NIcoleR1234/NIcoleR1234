/*
 CPS 161 MP2 
 Nicole Ramanathan
 */
package bounds;

import java.util.Scanner;

public class Bounds {

	public static void main(String[] args) {
		int start, upper, step, count=0;

		Scanner keyIn = new Scanner(System.in);
		System.out.print("What is the beginning integer value: ");
		start = keyIn.nextInt();
		System.out.print("What is the upper bound: ");
		upper = keyIn.nextInt();
		System.out.print("How much should the integer value be incremented by:");
		step = keyIn.nextInt();
		
		
		
		while (start<upper)
		{
			System.out.printf("%4d",start);
			start= start+step;
			count++;
			if (count%10==0)
				System.out.println();
		}
		keyIn.close();
	}
}
