import java.io.File; import java.util.Scanner;
import javax.swing.JOptionPane;
public class BinaryConversionFront End { 
    /* Make sure you check
    * - 128 which should give you - 10000000 (positive/neg) * 127 which should give you - 01111111
    * -32768 which should give you - 1000000000000000 (positive/neg) 32767 which should give you - 0111111111111111
    * -2431 (-2147483648) which is - 10000000000000000000000000000000 (positive/neg)
    * 2131-1 (2147483647) which is - 01111111111111111111111111111111
    * 2163 (-9223372036854775808) - 1000000000000000000000000000000000000000000000000000000000000000
    * 2163-1(9223372036854775807) - 0111111111111111111111111111111111111111111111111111111111111111
    */
public static final int MAX_BITS = 64; public static final int LONG = 64; 11-9223372036854775808 9223372036854775807 public static final int INT = 32; public static final int SHORT = 16; public static final int BYTE = 8; // Data Type Codes... public static final int STRING_TYPE = 0; public static final int INT_TYPE = 1; public static final int FLOAT TYPE = 2;
public static void main(String[] args) {
// TODO Auto-generated method stub
int dataType = -1; Scanner s = null; boolean allGood = false; try {
S = new Scanner(new File("testClass.txt")); 1/System.out.println("It's open");
allGood = true; } catch( Exception e) {
System.out.println("It's not open. There is an issue opening your file.");
if(allGood) { while(s != null && s. hasNextLine()) {
String next NumIn = s.nextLine();
if(itsNotANumber(next NumIn)) {
//check for bad input System.out.println(next NumIn + " is bad input");
dataType = STRING_TYPE; } else if (isАDecimal(next NumIn)) {
//check for a decimal System.out.println(next NumIn + " is a decimal");
dataType = FLOAT_TYPE; } else {
//its an integer
System.out.println(next Num In + " is an integer"); dataType = INT_TYPE;
//now process the numbers.... if(dataType == INT_TYPE) {
String binInt = ""; try {
long x = Long. parselong (next NumIn);
//This is my conversion method... binInt = binConvertInt(); System.out.println(binInt);
Large...");
} catch (Exception e) {
System.out.println(next NumIn + " .. Number is too binint = " + next NumIn + " is too big for Long";
} else if(dataType == FLOAT_TYPE) {
1/ Create the 32 bit float method.... } else {
// Strings??
s.close();
public static boolean itsNotANumber (String next NumIn) {
boolean itsNotANumber = false;
String nonNums = "abcdefghijklmnopqrstuvwxyz !@#$%^&*()_+= {[}]111:;"<,>/";
for(int l= 0; i < nonNums. length(); L++) { if(next NumIn.contains("" + nonNums.charAt(L))) {
itsNotANumber = true;
return itsNotANumber;
public static boolean isАDecimal(String next NumIn) {
boolean itsАDecimal = false; if(next NumIn.contains(".")) {
itsАDecimal = true;
return it sАDecimal;
    public static String binConvertInt(long num) {
        //This is your code for binary byte, short, int and long conversion 
        String binString = ""; 
        //Your code here.... 
        
        return binString;
    }
}
