package javapracticeprograms;

import java.util.Scanner;

public class Prblm12_PositiveNegetive {
    public static void main(String[] args) {
        double number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = scan.nextDouble();
        scan.close();

        if(number < 0.0){
            System.out.println(number+" is number negative");
        }
        else if (number > 0.0){
            System.out.println(number+" is number positive");
        }
        else
            System.out.println(number+ "must be a zero value");
    }
}
