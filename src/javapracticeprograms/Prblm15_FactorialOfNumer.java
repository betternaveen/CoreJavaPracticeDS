package javapracticeprograms;

import java.util.Scanner;

public class Prblm15_FactorialOfNumer {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want find factorial ");
        number = scan.nextInt();
        scan.close();
        System.out.println(factorial(number));

    }

    public static long factorial(int number){
        long fact  = 1 ;
        int i = 0 ;
        while (number > i){
            fact = fact * (i+1)  ;
            i++;
        }
      return fact;
    }
}
