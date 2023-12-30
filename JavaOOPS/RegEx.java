import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx{
    public static void main(String[] a){
        Pattern pattern = Pattern.compile("ShivaKumar",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Shiva");

        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found.");
        }else{
            System.out.println("Match Not Found.");
        }
    }
}