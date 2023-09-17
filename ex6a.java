package semester1.assaigment2;
// assignment: 2
// Author: Michael Kupfer , ID: 209493246

//check if prime number

import java.util.Scanner;
public class ex6a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();
        for(int i =2; i<=Math.sqrt(number);i++){
            if(number%i==0) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
