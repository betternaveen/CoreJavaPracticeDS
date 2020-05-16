package javapracticeprograms;

import java.util.Scanner;

public class Prblm26_PrintPrimeNumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the low : ");
        int low = scan.nextInt();
        System.out.print("Enter the high : ");
        int high  = scan.nextInt();
        scan.close();

        while (low < high){
            boolean flag = false;
            for (int i = 2; i < low/2; i++) {
                if(low % i == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.print(low+ " ");

            low++;
        }
    }
}
