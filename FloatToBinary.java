package convertFloatToBin;

// Probably need to change some or all of these ints to longs.
public class FloatToBinary {
	
	public String greeting() {
		return "Type a number. It can have a decimal part.";
	}
	
	public String convertFract(String decimalFractPartString, int bitsAvailable) {
		String binString = "";
		
		char binaryFractPartChars[] = new char[bitsAvailable];
		int lengthFractPartString = decimalFractPartString.length();
		System.out.println("lengthFractPartString is " + Integer.toString(lengthFractPartString));
		
		// Initialize variables to be changed in the loop.
		// Number of digits of the converted integer, which ignores preceding zeros.
		// It will be the int-truncated power of ten plus one. 
		long fractPart = Long.parseUnsignedLong(decimalFractPartString);
		System.out.println("The fractPart is " + Long.toString(fractPart));
		long doubleNum = 0;
		int lengthDoubleNum = 0;

		for (int index = 0 ; index < bitsAvailable ; index++) {

			if (fractPart == 0)  // Record a 0 as a bit and move on.
			{
				binaryFractPartChars[index] = '0';
				System.out.println("Setting bit as zero and iterating loop with no other changes...");
				continue;
			}
			
			/* 
			 * Multiply by 2.
			 * If number of digits increases beyond original, record the 1 and remove leftmost digit.
			 * If number of digits doesn't increase, record a zero into binString.
			 */
			doubleNum = fractPart * 2;
			lengthDoubleNum = (int) (Math.log10(doubleNum) + 1);
			System.out.println("lengthDoubleNum is " + Integer.toString(lengthDoubleNum));
			if (lengthDoubleNum > lengthFractPartString)  // Record a 1 as a bit and trunc the leftmost digit.
			{
				binaryFractPartChars[index] = '1';
				System.out.println("The string doubleNum is " + Long.toString(doubleNum));
				System.out.println("The string doubleNum shortened is " + Long.toString(doubleNum).substring(1));
				fractPart = Long.parseUnsignedLong(Long.toString(doubleNum).substring(1));
				System.out.println("The new fractPart is " + Long.toString(fractPart));
			}
			else  // Record a 0 as a bit and set the new fraction part being the double.
			{
				binaryFractPartChars[index] = '0';
				fractPart = doubleNum;
			}
			
		}
		
		binString = String.copyValueOf(binaryFractPartChars);
		return binString;
	}
}
