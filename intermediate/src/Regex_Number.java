import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Number {

    public static void main(String[] args) {

        String[] s = {"12345", "3.55", "30.22", "asdfg", "123abc", "-12345"};

        String numPattern ="[-+]?\\d*\\.?\\d+";

        Pattern regex=Pattern.compile(numPattern);

        for(String str :s)
        {
            Matcher matcher = regex.matcher(str);

            if(matcher.matches())
            {
                System.out.println("Valid Number");
            }
            else{
                System.out.println("Invalid Number");
            }
        }
    }
}
