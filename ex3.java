package semester1.assaigment2;
// assignment: 2
// Author: Michael Kupfer , ID: 209493246
//program that gets numbers from user until he puts in 0 or negative number.
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer (or 0 or negative number to finish):");
        int number = input.nextInt();
        int count=0,max=0;
        int min =number;
        //gets numbers from user
        while(number>0) {
            //count the numbers of positive numbers
            count++;
            //puts minimal number
            if(number<min)min=number;
            //puts maximal number
            if(number>max)max=number;
            number = input.nextInt();
        }
        //in case of no positive numbers
        if(count==0){
            System.out.println("No positive numbers were entered!");
            return;
        }
        //print all the info
        System.out.println("Positive numbers entered: "+count);
        System.out.println("Minimal number: "+min);
        System.out.println("Maximal number: "+max);

        }

}
