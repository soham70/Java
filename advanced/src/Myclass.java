public class Myclass {

    //public attribute
    public int publicVar=10;

    //public method
    public void publicMethod()
    {
        System.out.println("This is a Public Method...");
    }


    //private attribute
    private int privariable=20;

    //private method
    private void priMethod()
    {
        System.out.println("This is Private Method");
    }

    //protected attributes
    protected void protectedMethod()
    {
        System.out.println("This is Protected method");
    }

    public static void main(String[] args)
    {
        Myclass myObj=new Myclass();
        //private attributes available within the class only.
        System.out.println(myObj.privariable);
        myObj.priMethod();
        myObj.protectedMethod();//self class accessible



    }

}
