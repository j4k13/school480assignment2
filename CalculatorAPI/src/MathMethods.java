/**
 * Class for implementing MathMethods
 *
 * @author Jacqueline Anderson, Andrea Cowley, Diondra Whindleton
 * @version 1.0
 */
public class MathMethods
{
	/**
	 * Basic Addition function
	 *
	 * @param var1 first value to be added
	 * @param var2 second value to be added
	 * @return Sum of var1 and var2
	 */
	public static double Addition(double var1, double var2)
	{
		return var1+var2;
	}

	/**
	 * Basic Subtraction function
	 *
	 * @param var1 value to be subtracted from
	 * @param var2 value to subtract
	 * @return difference of var1 and var2
	 */
	public static double Subtraction(double var1, double var2)
	{
		return var1-var2;
	}

	/**
	 * Basic Mutliplication function
	 *
	 * @param var1 first value to be mutliplied
	 * @param var2 second value to be multiplied
	 * @return Product of var1 and var2
	 */
	public static double Multiplication(double var1, double var2)
	{
		return var1*var2;
	}

	/**
	 * Basic Division function
	 *
	 * @param var1 value to be divided
	 * @param var2 value to divide by
	 * @return Qoutient of var1 and var2
	 * @throws IllegalArgumentException If var2 is 0
	 * @exception ArithmeticException
	 */
	public static double Division(double var1, double var2)
	{
		if(var2 == 0)
			throw new ArithmeticException();
		return var1/var2;
	}

	/**
	 * Basic Square Root function
	 *
	 * @param var1 value to find the root of
	 * @return Sqaureroot of var1
	 * @throws IllegalArgumentException If var1 is less than 0
	 * @exception ArithmeticException
	 */
	public static double SquareRoot(double var1)
	{
		if(var1 < 0)
			throw new ArithmeticException();
		return Math.sqrt(var1);
	}

	/**
	 * Add Pi
	 *
	 * @return value of pi
	 */
	public static double Pi()
	{
		return 4*Math.atan(1);
	}

	/**
	 * Basic Power of function
	 *
	 * @param var1 value to take the power of
	 * @param var2 the power to take it too
	 * @return the var2 power of var1
	 * @exception ArithmeticException
	 */
	public static double toThePowerOf(double var1, double var2)
	{
		if(var2 < 0)
			throw new ArithmeticException();
		return Math.pow(var1, var2);
	}
}
