package javapracticeprograms;

import java.util.Scanner;

public class Prblm31_FactorsOfANumber {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number list the factors");
        number = scan.nextInt();
        scan.close();

        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                System.out.print(i + "  ");
            }
        }
    }
}
