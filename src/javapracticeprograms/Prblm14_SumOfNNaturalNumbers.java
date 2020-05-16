package javapracticeprograms;

import java.util.Scanner;

public class Prblm14_SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = scan.nextInt();
        scan.close();
        long sum  = 0 ;
        for (int i = 1; i <= number; i++) {
            sum = sum+i;
        }
        System.out.println("Sum of "+number + " natural numbers is :"+sum);

    }
}
