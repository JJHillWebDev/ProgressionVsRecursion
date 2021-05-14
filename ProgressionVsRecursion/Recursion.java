/**			
   This program demonstrates factorials using recursion.
*/

public class Recursion
{
	public static void main(String[] args)
	{
		int n = 7;

		// Test out the factorial
		System.out.println(n + " factorial equals ");
		System.out.println(Recursion.factorial(n));
		System.out.println();
	}
         
	/**
      This is the factorial method.
      @param n A number.	     
      @return The factorial of n.
	*/
          
	public static int factorial(int n)
	{
		//step 2a
		int temp;
		System.out.println("Method call -- " + 
						   "calulating " + 
						   "Factorial of: " + n);

		if (n == 0)
		{
			return 1;
		}
		else
		{
			//step 2c
			temp = factorial(n - 1);
			System.out.println("Factorial of: " +
								(n - 1) + " is " +
								temp);
			return (temp * n);
		}
	}
}
		     
