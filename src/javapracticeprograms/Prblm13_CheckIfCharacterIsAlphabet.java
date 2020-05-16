package javapracticeprograms;

import java.util.Scanner;

public class Prblm13_CheckIfCharacterIsAlphabet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char c = scan.next().charAt(0);

        System.out.print("Enter the number you want to check:");
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}
