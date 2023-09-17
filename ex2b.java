package semester1.assaigment2;

// assignment: 2
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
public class ex2b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer (or 0 to finish: ");
        //gets number from user and print the number of even digits,
        // the seventh number, and number of zero digits in number.
        int number = input.nextInt();
        while (true) {
            if (number < 0){
                number = input.nextInt();
                continue;
            }
            if(number==0)
                break;
            int evenCounter = 0;
            int theseventh = 0;
            int count = 1;
            int zeorcounter = 0;
            while (number > 0) {
                if (number % 2 == 0)
                    evenCounter++;
                if (number % 10 == 0)
                    zeorcounter++;
                if (count == 3)
                    theseventh = number % 10;
                count++;
                number /= 10;
            }
            System.out.println("The number of even digits is: " + evenCounter);
            System.out.println("The seventh number is: " + theseventh);
            System.out.println("The number of zero in number is: " + zeorcounter);
            number = input.nextInt();
        }
    }
}
