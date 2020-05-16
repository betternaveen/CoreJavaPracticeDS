package javapracticeprograms;

import java.util.Scanner;

public class Prblm9_largestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter Second number");
        int num2 = scan.nextInt();
        System.out.println("Enter Third number");
        int num3 = scan.nextInt();

        int largest;

        if( num1 > num2 &&  num1 > num3){
            largest = num1;
        }
        else if (num2 > num3){
            largest = num2;
        }
        else
            largest = num3;

        System.out.println(largest+ " is the largest number");

    }
}
