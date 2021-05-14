import java.util.Scanner;

/**
   This program calculates the geometric and	
   harmonic progression for a number entered     
   by the user.
*/

public class Progression
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);

		System.out.println("This program will calculate " +		
                           "the geometric and harmonic "  +		
                           "progression for the number " +
                           "you enter.");
                         
		System.out.print("Enter an integer that is " +     
                         "greater than or equal to 1: ");
                       
		int input = keyboard.nextInt();

		// Match the method calls with the methods you write
		int geomAnswer = geometricRecursive(input);
		double harmAnswer = harmonicRecursive(input);

		System.out.println("Using recursion:");
      
		System.out.println("The geometric progression of " +
                           input + " is " + geomAnswer);
                           
		System.out.println("The harmonic progression of " +
                           input + " is " + harmAnswer);

        // Match the method calls with the methods you write
		geomAnswer = geometricIterative(input);
		harmAnswer = harmonicIterative(input);

		System.out.println("Using iteration:");
		System.out.println("The geometric progression of " +
                           input + " is " + geomAnswer);
                           
		System.out.println("The harmonic progression of " +
                           input + " is " + harmAnswer);
	}

	// ADD LINES FOR TASK #2 HERE
	// Write the geometricRecursive method
	public static int geometricRecursive(int n)
	{
		int temp;

		if (n <= 1)
		{
			return 1;
		}
		else
		{
			temp = geometricRecursive(n - 1);
			return (temp * n);
		}
	}
	// Write the geometricIterative method
	public static int geometricIterative(int n)
	{
		int result = 1;

		for (int i = 1; i <= n; i++)
		{
			result = result * i;
		}

		return result;
	}
	// Write the harmonicRecursive method
	public static double harmonicRecursive(int n)
	{
		double temp1;
		double temp2;

		if (n <= 1)
		{
			return 1;
		}
		else
		{
			temp1 = 1.0 * harmonicRecursive(n - 1);
			temp2 = 1.0 / n;
			return (temp1 * temp2);
		}
	}
	// Write the harmonicIterative method
	public static double harmonicIterative(int n)
	{
		double result = 1;
		double temp;

		for (int i = 1; i <= n; i++)
		{
			temp = 1.0 / i;
			result = result * temp;
		}
		return result;
	}
}
