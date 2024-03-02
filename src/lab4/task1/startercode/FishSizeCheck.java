/*
 * Lab Exercise 04 (23S) Task 1 Starter Code
 * Author: Amal Ibrahim
 * Modified By:
 * Desciption: Lab Exercise 04 Task 1
 * References (in order of the lab handout)
 * [1] Fishing limits, size restrictions and catch and release. Ontario.ca. 
 *     https://www.ontario.ca/page/fishing-limits-size-restrictions-and-catch-and-release (Accessed Oct 26, 2022).
 * [2] Fisheries Management Zone 12. Ontario.ca. 
 *     https://www.ontario.ca/document/ontario-fishing-regulations-summary/fisheries-management-zone-12 (Accessed Oct 26, 2022).
 * [3] Muskellunge. en.wikipedia.org. 
 *     https://en.wikipedia.org/wiki/Muskellunge (Accessed Oct 26, 2022)
 */

/*
 * ToDo: Provide overview of class, and comment all constructors and methods
 */
package lab4.task1.startercode;
import java.util.Scanner;


public class FishSizeCheck {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Muskellunge muskie = new Muskellunge();
		double length;
		
		String report;
		
		System.out.printf("%s", "Enter length: ");
		length = keyboard.nextDouble();
		/* Fixed bug:
		 * Miss a Setter method, need to set the input length to muskie.
		 */
		muskie.setLength(length);
		report = muskie.catchReport();
		
		System.out.printf("%s%n", report);
		System.out.printf("%s%n", "Program modified by Liying Guo");
		
	}

}
