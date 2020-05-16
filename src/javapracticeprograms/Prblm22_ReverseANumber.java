package javapracticeprograms;

import java.util.Scanner;

public class Prblm22_ReverseANumber {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to reverse");
        number = scan.nextInt();
        scan.close();

        System.out.println(reverse(number));

    }

    static int reverse(int number){
        int reverse = 0;

        while (number != 0 ) {
            int  n  = number % 10;;
            reverse = reverse * 10 + n;
            number = number/10;
        }
        return reverse;
    }
}
