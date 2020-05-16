package javapracticeprograms;

import java.util.Scanner;

public class Prblm24_CheckPolindromeNumber {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check if the number is Polindrome or not");
        number = scan.nextInt();
        scan.close();

        int rev = 0;
        int actualNum = number;
        //1234

        while(number != 0 ){
            int n = number % 10;
            rev = rev * 10 + n;
            number = number / 10;
        }
        if(actualNum == rev)
            System.out.println(actualNum +" is a Polindrome");
        else
            System.out.println(actualNum +" is a not a Polindrome");
    }
}
