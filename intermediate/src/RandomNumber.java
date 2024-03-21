import  java.util.Random;

public class RandomNumber {

    public static void main(String[] args)
    {
        long randonNum=generateNum();
        System.out.println("Random 10 digit number is " + randonNum);
    }

    public static long generateNum(){
        Random random= new Random();
        long min =1000000000L;
        long max =9999999999L;

        long randomNumber = min + ((long) (random.nextDouble() * (max-min+1)));
    return  randomNumber;
    }


}
