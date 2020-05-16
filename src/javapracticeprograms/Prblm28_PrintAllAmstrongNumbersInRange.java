package javapracticeprograms;

import java.util.Scanner;

public class Prblm28_PrintAllAmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the low : ");
        int low = scan.nextInt();
        System.out.print("Enter the high : ");
        int high  = scan.nextInt();
        scan.close();


        while (low < high) {

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


}
