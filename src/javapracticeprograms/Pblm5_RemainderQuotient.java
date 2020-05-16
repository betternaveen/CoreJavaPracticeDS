package javapracticeprograms;

import java.util.Scanner;

public class Pblm5_RemainderQuotient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter Second number");
        int num2 = scan.nextInt();

        System.out.println("Quotient of these two numbers is :" +num1/num2);
        System.out.println("Remainder of these two numbers is :" +num1%num2);
    }
}
