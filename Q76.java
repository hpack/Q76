
import java.util.Scanner;
import java.lang.Math;


public class Q76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The population of Mexico at the end of 2014 was around 123.8 million");
		System.out.println("enter the target population number (in millions): ");
		Scanner scanner = new Scanner(System.in); //scanner object
		double input = scanner.nextDouble();
		
		double x = logOfBase(1.05, (input/123.8)) + 2014; //equation
		
		System.out.println(("The year in which Mexico will reach or exceed the number: ") + x);
				
		
	}
	
	public static double logOfBase(double base, double num) { //method to create a log with any base and number
	    return Math.log(num) / Math.log(base);
	}

}
