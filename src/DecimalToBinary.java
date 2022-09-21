
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalToBinary {

        // function to convert decimal to binary
        static void decToBinary ( int n)
        {
            // array to store binary number
            int[] binaryNum = new int[1000];

            // counter for binary array
            int i = 0;
            while (n > 0) {
                // storing remainder in binary array
                binaryNum[i] = n % 2;
                n = n / 2;
                i++;
            }

            // printing binary array in reverse order
            for (int j = i - 1; j >= 0; j--)
                System.out.print(binaryNum[j]);
        }


    public static void main (String[] args)
    {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Please enter Any Given Number");
                int a = s.nextInt();
                //int n = 17;
                System.out.println("Decimal - " + a);
                System.out.print("Binary - " );
                 decToBinary(a);
                System.out.println(" ");
            }
            catch (InputMismatchException e){
                System.out.println("Oops that was an invalid input!!! TRY AGAIN");
                }
                }
        }
    }