package JavaOOP;

public class Constructors {
    
    public Constructors()
    {
        System.out.println("Default Constructor Called");
    }

    public Constructors(int x)
    {
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        Constructors cn=new Constructors();
        Constructors cnn =new Constructors(10);
    }
}
