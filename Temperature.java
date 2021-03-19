/*
 CPS 161 MP2 
 Nicole Ramanathan
 */
package temperature;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		int count = 0;
		double cent = 0, fahr = 0, tot_cent = 0, tot_fahr = 0, av_cent = 0, av_fahr = 0;

		Scanner keyIn = new Scanner(System.in);

		while (cent > -100) {
			// Input
			System.out.print("Enter the Temperature in Centigrade or <= -100.0 to quit: ");
			cent = keyIn.nextDouble();
			// Process
			if (cent > -100) {
				tot_cent = tot_cent + cent;
				fahr = (9.0 / 5.0) * cent + 32.0;
				tot_fahr = tot_fahr + fahr;
				count++;
			}
			System.out.print("Temperature: F(" + fahr + ")   C(" + cent + ")\n");
		}
		av_cent = tot_cent / count;
		av_fahr = tot_fahr / count;

		System.out.print("\n\nAverage: Fahrenheit: (" + av_fahr + " )   Average:  Centigrade(" + av_cent + ")\n");
		keyIn.close();
	}
}
