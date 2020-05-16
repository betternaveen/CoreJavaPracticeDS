package javapracticeprograms;

import java.util.Scanner;

public class Prblm16_MutliplicationTable {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to have multiplication table");
        number = scan.nextInt();
        scan.close();

        for(int i = 1; i <= 10 ; i++){
            System.out.println(number +"  *  "+i+ " = "+ number*i);
        }
    }
}
