package javapracticeprograms;

import java.util.Scanner;

public class Prblm29_PrintPrimeNumberInRangeUsingFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the low : ");
        int low = scan.nextInt();
        System.out.print("Enter the high : ");
        int high  = scan.nextInt();
        scan.close();
        System.out.println("Here are the prime numbers in the given range");
        for (int i = low; i < high; i++) {
            printPrime(i);
        }
    }
    private static void printPrime(int low) {
            boolean flag = false;
            for (int i = 2; i < low/2; i++) {
                if(low % i == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.print(low+ " ");
        }
}
