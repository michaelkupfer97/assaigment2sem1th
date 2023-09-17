package semester1.assaigment2;

// assignment: 2
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        //gets 2 numbers from user.high and low.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers. high and low: ");
        int high = input.nextInt();
        int low = input.nextInt();
        //create array of length between low and high with 2 rows
        int arr[][]=new int [(high-low)+1][2];
        int place=0;
        //for loop that check each number in the range.
        for (int i =low;i<= high;i++){
            int count=0;
            //for loop with if that check number of divisors and counting them.
            for(int j = 1;j<=i;j++){
                if (i%j==0)
                    count++;
            }
            //put the numbers of divisors and the number itself im the array.
            arr[place][0]=count;
            arr[place][1]=i;
            place++;
        }
        //check the maximal divisors at the range and print it.
        int max=0;
        for (int k=0;k< arr.length;k++)
            if(arr[k][0]>max) max=arr[k][0];
        System.out.println("Maximal number of divisors is: "+max);
        //print all the numbers with max divisors.
        for(int s=0;s< arr.length;s++)
            if(arr[s][0]==max){
                System.out.println(arr[s][1]+" has "+max+" divisors.");
            }
    }
}
