package javapracticeprograms;

import java.util.Scanner;

public class Prblm21_countDigitsInNumber {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to find the no of digits in number");
        number = scan.nextInt();
        scan.close();

        int digits = 0;

        while (number != 0){
            digits++;
            number = number/10;
        }

        System.out.println("Number of digits in the number is : "+digits);

    }
}
