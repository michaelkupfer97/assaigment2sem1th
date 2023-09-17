package semester1.assaigment2;

// assignment: 2
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        /* program that gets from the user numbers until the number 0 is coming. */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive integer (enter 0 to finish):");
        long number = input.nextLong();
        int max=0;
        while(true){
            if(number==0)
                break;
            int maxinside=0;
            /* loop that check how many times 7 appears in number. */
            while(number>0){
                if(number%10==7)
                    maxinside++;
                number/=10;
            }
            if(maxinside>max)
                max=maxinside;
            /* get new number from user */
            System.out.println("Enter positive integer (enter 0 to finish):");
            number = input.nextLong();
        }
        System.out.println("The maximum number of times 7 appeared is: "+max);
    }
}
