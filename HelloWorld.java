public class HelloWorld
{   
	static String randomString  = "string to print";
	static final double PINUM = 3.14;
	
	public static void main(String[] args)
	
	
	{   
		
		
		//Primitive Data Types
		
		//numeric data types
		byte maxByte = 127;
		short maxShort = 32767;
		long maxLong = 9223372036854775807L;
		float maxFloat = 3.14F;
		double maxDouble = 3.1234567890;
		
		//non-numeric data types
		boolean True= true;
		boolean False = false;
		char char1  = 65;
		char char2 = 'A';
		
		
		//System.out.print("Hello World " + randomString + PINUM+"\n");
		//System.out.print(char1 + "\t" + char2);
		//static variable can be modified
		randomString = randomString + "X";
		// below line will throw error as a constant variable cannot be modified.
		// PINUM = 3.15;
		
		//type-casting
		//widening
		int num1 = 100;
		long l1 = num1;
		double d1 = num1;
		System.out.print(num1 + "\n");
		System.out.print(l1+"\n");
		System.out.print(d1);
		
		//narrowing - has to be explicit
		double d2 = 100.04; 
		// throws error as narrowing cant be implicit
		// long l2 = d2;
		long l2 = (long)d2;
		int num2 = (int)d2;
	}
	
}