package javapracticeprograms;

import java.util.Scanner;

public class Prblm11_LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an year to test weather its a leap year or not");
        int year = scan.nextInt();

        System.out.println(checkYear(year));


    }
    static boolean checkYear(int year)
    {
        // If a year is multiple of 400,
        // then it is a leap year
        if (year % 400 == 0)
            return true;

        // Else If a year is muliplt of 100,
        // then it is not a leap year
        if (year % 100 == 0)
            return false;

        // Else If a year is muliplt of 4,
        // then it is a leap year
        if (year % 4 == 0)
            return true;
        return false;
    }
}
