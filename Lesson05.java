//Exceptions


import java.util.Scanner;
import java.util.InputMismatchException;

class Lesson05{
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		divideByZero(2);
		validateInput();
		
	}
	public static void divideByZero(int num) {
		try 
		{
			System.out.println(num/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
	}
	
	public static void validateInput() {
		try
		{
			int num = userInput.nextInt();
			
		}
		catch(InputMismatchException e)

        {

            userInput.next(); // Skips the last user input and waits for the next
            System.out.print("That isn't a whole number");

           

        }
		
		finally
		{
			System.out.println("Execute anyway");
		}
			
		
	
	}
}