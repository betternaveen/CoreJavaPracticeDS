package javapracticeprograms;

import java.util.Scanner;

public class Prblm23_PowerOfANumber {
    public static void main(String[] args) {
        int base;
        int exponent;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        base = scan.nextInt();
        System.out.print("Enter the exponent : ");
        exponent = scan.nextInt();
        scan.close();
        long result = 1;


        while (exponent != 0){
            result = result * base;
            --exponent;
        }
        System.out.println(result);

        //System.out.println(Math.pow(base,exponent));
    }
}
