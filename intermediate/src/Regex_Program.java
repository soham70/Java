import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Program {

    public static void main(String[] args)
    {
        Pattern pattern=Pattern.compile("JavaCoding",Pattern.CASE_INSENSITIVE);
        Matcher matcher =pattern.matcher("Learn JavaCoding is Easy");
        boolean matchFound= matcher.find();

        if(matchFound)
        {
            System.out.println("Match Found");
        }
        else{
            System.out.println("Match Not Found");
        }
    }
}
