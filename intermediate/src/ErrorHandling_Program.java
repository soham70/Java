public class ErrorHandling_Program {

    static void checkage(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Age less than 18: Access Denied");
        }
        else{
            System.out.println("Access Granted!!!");
        }
    }

    public static void main(String[] args)
    {

        //Using try,catch,finally

//        try{
//            int[] num={1,2,3,4,5};
//            System.out.println(num[6]);
//        }
//        catch (Exception e) {
//            System.out.println("Something went wrong....");
//        }
//        finally {
//            System.out.println("try-Catch finished");
//        }

        //method to check age
        //checkage(2);

        //creating custom exception using throw

        try{
            int age = -10;
            if(age<0)
            {
                throw new IllegalArgumentException("Age cannot be negative");

            }
            System.out.println("Your Age is: " + age );
        }
        catch (IllegalArgumentException i)
        {
            System.out.println("Exception occurred: " + i.getMessage());
        }




    }
}
