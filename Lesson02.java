import java.util.Scanner;
// import java.util.*;

public class Lesson02
{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter name, age and salary:");
		if (userInput.hasNext()) {
			//int numberEntered = userInput.nextInt();
			//System.out.println("You entered: " + numberEntered);
			//int doubled = 2 * numberEntered;
			//System.out.println("Doubled = " + doubled);
			String name = userInput.nextLine();
			int age = userInput.nextInt();
			float salary = userInput.nextFloat();
			System.out.println(name + " is " + age + " years old " + " and earns " + salary);
			
			
		}
		else
		{
			System.out.println("Enter an integer next time!");
		}
	}
	
}

