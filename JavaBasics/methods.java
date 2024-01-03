public class methods{

static void mymethod()
{
    System .out.println("MyMethod function");
}

static void lastname(String fname)
{
    System.out.println(fname);
}

static int addition(int x,int y)
{
    return x+y;
}

    public static void main(String[] args)
    {
        mymethod();
        lastname("Sheth");
        System.out.println(addition(5, 10));
    }
}