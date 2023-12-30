import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class MyDate{
    public static void main(String[] args){
        LocalDateTime objDate = LocalDateTime.now();
        System.out.println("Before formatting: " + objDate);

        DateTimeFormatter myDate = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:SS");
        System.out.println("After My formatting: " + myDate);

    }
}