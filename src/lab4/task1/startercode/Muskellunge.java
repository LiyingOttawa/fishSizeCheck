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
public class Muskellunge {
	private static final int LIMIT_SIZE = 137; // centimeters [2]
	
	private double length;
	
	public Muskellunge() {
		this(0);
	}
	
	public Muskellunge(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		
		/* Fixed bug:
		 * The field variable length has not assigned value 
		 */
		this.length = length;
	}
	
	public String catchReport() {
		boolean isOverLimit;
		String report;
		
		/* Fixed bug:
		 * No match to requirement. Only require a length greater than 137, no equal to 137.
		 */
		isOverLimit = length > LIMIT_SIZE;
		
		/* Fixed bug:
		 * Use wrong operator. In Boolean Math use "==" to express "equal to"
		 */
		if(isOverLimit == true) {
			report = "Keeper";
		}
		else {
			report = "Release";
		}
		
		return report;
	}
	
	

}
