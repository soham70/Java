package JavaOOP;

public class FinalKeyWord {

    final int x=10;
    final int y=20;

    public static void main(String[] args)
    {
    FinalKeyWord myObj = new FinalKeyWord();
    // myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    // myObj.y = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
    System.out.println(myObj.y);
    }
}
