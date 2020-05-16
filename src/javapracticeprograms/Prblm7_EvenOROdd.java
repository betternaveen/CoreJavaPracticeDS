package javapracticeprograms;

import java.util.Scanner;

public class Prblm7_EvenOROdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter13 number you want to check if it is ODD or EVEN");
        int num = scan.nextInt();

        if((num & 1) == 02)
            System.out.println(num+" is Even Number");
        else
            System.out.println(num+" is ODD Number");


    }
}
