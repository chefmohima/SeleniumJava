import java.util.Arrays;
class Lesson06{
	public static void main(String[] args) {
		// You combine Strings with a +
		System.out.println("I am a string - " + "now concatenated");
		
		// type-casting
		// to string from other data types
		int num = 6;
		String num_str = Integer.toString(num);
		System.out.println("Number = " + num + " converted to String = " + num_str);
		/* You convert primitive types to a string with toString
		 * String byteString = Byte.toString(bigByte);
		 * String shortString = Short.toString(bigByte);
		 * String intString = Integer.toString(bigInt);
		 * String longString = Long.toString(bigByte);
	     * String floatString = Float.toString(bigByte);
	     * String doubleString = Double.toString(bigByte);
	     * String booleanString = Boolean.toString(bigByte);
	     * You convert from String to primitives with parse
		 * int stringToInt = Integer.parseInt(intString);
		 * parseSort, parseLong, parseByte, parseDouble,
		 * parseBoolean, parseFloat
		 */
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		if (!(uppercaseStr.equals(lowercaseStr))){
			System.out.println("They are not equals");
		}
		if (uppercaseStr.equalsIgnoreCase(lowercaseStr)){
			System.out.println("equal");
		}
		
		System.out.println("ABCDEF".contains("CD"));
		System.out.println("ABCDEF".startsWith("CD"));
		System.out.println("ABCDEF".endsWith("F"));
		System.out.println("ABCDEF".startsWith("AB"));
		System.out.println("ABCD".indexOf("CD"));
		System.out.println("ABCDBCD".indexOf("B",2));
		System.out.println("ABCDBCD".lastIndexOf("B"));
		System.out.println("ABCDBCD".length());
		System.out.println("ABCDE".replace("BC", "CB"));
		
		
		// split string to array
		String[] arrayOfLetters = "ABC,DE".split(",");
		System.out.println(Arrays.toString(arrayOfLetters));
		
		System.out.println("ABCDEF".substring(1,3));
		
		
		
		//StringBuilder
		StringBuilder randSB = new StringBuilder("A random string");
		System.out.println(randSB.append(" again"));
		System.out.println(randSB);
		System.out.println(randSB.delete(1,4));
		System.out.println(randSB);
		System.out.println(randSB.capacity());
		randSB.ensureCapacity(60);
		System.out.println(randSB.capacity());
		System.out.println(randSB.insert(1, "nother"));
		System.out.println(randSB);
		String stringFromSB= randSB.toString();
		System.out.println(stringFromSB);
		/* StringBuilders also have the same methods as Strings
		 * charAt(), indexOf(), lastIndexOf(), subString()
		*/



		


		
		

		
		


	}
}