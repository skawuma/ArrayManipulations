
import java.util.InputMismatchException;
import java.util.Scanner;
public class BinaryToDecimal {

    public static void binToDec(String s)
    {
        int m = 0;
        int k = 1;
        for(int i = s.length() - 1; i >= 0; i--){
            m += (s.charAt(i) - '0') * k;
            k = k * 2;
        }
        System.out.println(m);
    }


    public static void main(String[] args)
    {while (true) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter Any Given Number");
            String s = sc.nextLine();
            System.out.println("Decimal - " + s);
            System.out.print("Binary - " );
            binToDec(s);
            System.out.println(" ");
        }
        catch (InputMismatchException e){
            System.out.println("Oops that was an invalid input!!! TRY AGAIN");
        }
    }

    }
}
