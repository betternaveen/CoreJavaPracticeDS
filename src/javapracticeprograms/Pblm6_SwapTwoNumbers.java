package javapracticeprograms;

import java.util.Scanner;

public class Pblm6_SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter Second number");
        int num2 = scan.nextInt();

        System.out.println("Before swapping : ");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        num1 = num1+num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping : ");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
}
