// Add this code
// Student Name 	: Joshua Watsom
// Student Id Number: C00324700
// Date 			: Sep-2026
// Purpose 			: My first class implementation

public class ThermTest // When it comes to a class it's like an external page to be used multiple times and universally with other pages 
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		Thermometer thermB = new Thermometer(10.0) ;

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );

		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() ); // To check if ThermB is at 0
		
		
		
	} // end main
} // end class ThermTest