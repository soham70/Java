public class Recursion {

//    public static void numbersdesc(int n)
//    {
//        if(n<=0)
//            return;
//
//        System.out.println(n);
//        numbersdesc(n-1);
//
//    }

    public static void numbersasc(int n)
    {
        if(n>10)return;;

        System.out.println(n);
        numbersasc(n+1);
    }

    public static int sum(int n)
    {
        if(n<=0)return 0;

        int add = n+sum(n-1);
        return add;
    }

    public static void main(String[] args){
//        numbersdesc(10);
//        numbersasc(1);

        int res=sum(10);
        System.out.println(res);

    }
}