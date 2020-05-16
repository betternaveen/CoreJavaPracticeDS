package javapracticeprograms;

import java.util.Scanner;

public class Prblm25_IsNumberAPrime {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check if the number is Prime or not");
        number = scan.nextInt();
        scan.close();

        if (checkPrime(number))
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is a not a prime number");
    }

    public  static boolean checkPrime(int number){
        int count =0;
        for (int i = 1; i <= number/2; i++) {
            if(number % i == 0) count++;
        }
        return count==2;
    }
}
