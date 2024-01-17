import java.util.Scanner;

/*
 The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class
 and use any of the available methods found in the Scanner class documentation.
  In our example, we will use the nextLine() method, which is used to read Strings:

 */

/*

Method	Description
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user



 */

public class UserInput {

    public static void main(String[] args)
    {   
        Scanner myObj =new Scanner(System.in);
        System.out.println("Enter Your Name and Age:");

        String name=myObj.nextLine();
        System.out.println("Your Name is "+name);

        int age=myObj.nextInt();
        System.out.println("Age:"+age);

    }

}
