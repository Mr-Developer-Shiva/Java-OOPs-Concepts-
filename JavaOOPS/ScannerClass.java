import java.util.Scanner;

public class ScannerClass
 {
    public static void main(String[] args)
    {
        Scanner myObj  = new Scanner (System.in);
        System.out.println("Enter a Username");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
        //nextBoolean(),nextInt(),nextByte(),nextFloat(),
        //nextLine(),nextLong(),nextShort(),nextDouble().
    }


}