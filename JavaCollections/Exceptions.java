package JavaCollections;

// The try statement allows you to define a block of code to be tested for errors while it is being executed.

// The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

// The finally statement lets you execute code, after try...catch, regardless of the result


public class Exceptions {
    public static void main(String[] args)
    {
        try{
        int[] numbers={1,2,3};
        System.out.println(numbers[8]);
        }
        catch(Exception e)
        {
            System.out.println("Something Went Wrong....");
        }
        finally{
            System.out.println("Try Catch Executed");
        }
        //Without Try Catch block:
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 3
        // at JavaCollections.Exceptions.main(Exceptions.java:8)

    }

}
