package javapracticeprograms;

import java.util.Scanner;

public class Prblm27_CheckIfNumberIsAmstrongNumber {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check if the number is Prime or not");
        number = scan.nextInt();
        scan.close();


        if(checkAmstrongNumber(number)){
            System.out.println("It is an Amstrong Number");
        }
        else
            System.out.println("It is not an Amstrong Number");

    }

    private static boolean checkAmstrongNumber(int number) {
        // 153
        int actualNumber = number;
        double ams = 0;
        while (number != 0){
            int n = number % 10;
            ams = ams + Math.pow(n,3);
            number = number/10;
        }
        return (actualNumber == (int)ams);
    }
}
