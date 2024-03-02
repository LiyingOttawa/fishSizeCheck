/*
* Assessment: Lab Exercise 04
* Student Name: Liying Guo
* Due Date: July 21, 2023
* Description: Orange Program for Lab Exercise 04
* Professor Name: Amal Ibrahim
*/
package lab4.task1.startercode;

import java.util.Scanner;

public class OrangeProgram {

	public static void main(String[] args) {
		//instantiate an object orange
		Orange orange = new Orange();
		//output message
		System.out.print("Enter orange count:");
		//input by users
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		//define the variable
		//Assign the result of matching count with a set of values
		boolean isValid = count==163||count==150||count==138||count==125||count==113||count==100||count==88||count==80;
		
		if(isValid) {
			//if isValid is true, set the user-input to object by setter method 
			orange.setCount(count);
			//run work method to get the report value 
			double reportValue = orange.costPerOrange();
			//output the report value with a required format
			System.out.printf("Orange cost is: $%.3f %n",reportValue);
			}
		else {
			//if isValid is false, output this message
			System.out.println("Invalid count entered");
		}
		System.out.println("Program by Liying Guo");
	}

}
