package javapracticeprograms;

import java.util.Scanner;

public class Prblm30_PrintAllAmstrongNumbersInRangeUsingFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the low : ");
        int low = scan.nextInt();
        System.out.print("Enter the high : ");
        int high  = scan.nextInt();
        scan.close();
        System.out.println("Here are the Amstrong numbers in the given range");
        for (int i = low; i < high; i++) {
            printAmstrong(i);
        }
    }

    private static void printAmstrong(int low) {
        // 153
        int number = low;
        double ams = 0;
        while (number != 0) {
            int n = number % 10;
            ams = ams + Math.pow(n, 3);
            number = number / 10;
        }
        if(low == (int)ams){
            System.out.print(low + " ");
        }
        low++;
    }


}
