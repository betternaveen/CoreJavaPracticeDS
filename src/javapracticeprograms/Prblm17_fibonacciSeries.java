package javapracticeprograms;

import java.util.Scanner;

public class Prblm17_fibonacciSeries {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to have fibonacci series");
        number = scan.nextInt();
        scan.close();

        int first = 0 ;
        int second = 1 ;

        for (int i = 0; i < number; i++) {
            System.out.print(first+" ");
            int sum = first + second;
            first = second;
            second = sum;
        }



    }
}
