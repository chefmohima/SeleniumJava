class Lesson03
// Conditionals

{
	public static void main(String args[])
	{
		int randomNumber = (int)(Math.random()*50);
		System.out.println(randomNumber);
		
		// if-else
		if (randomNumber > 25) {
			System.out.println("The number is > than 25");
		}
		else if (randomNumber > 50) {
			System.out.println("Number is > 50");
		}
		else {
			System.out.println("Number is < 25");
		}
		
		// ternary operator
		String result = (randomNumber > 25)? "Greater than 25" : "Less than 25";
		System.out.println(result);
		
		// switch-case
		String day = "Sunday";
		switch(day)
		{
		case "Tuesday":
			System.out.println("Weekday");
			break;
		case "Sunday":
			System.out.println("WEEKEND");
			break;
		default:
			System.out.println("Some day");
			
			
		}
	}
}