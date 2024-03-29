import java.io.*;

//Write your code here

class Arithmetic {

    public int add (int x, int y) {
        int z = x+y;
        return z;
    }
}

class Adder extends Arithmetic {
}

public class Solution{
    public static void main(String[] args) {
        //Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.println(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
} 
