package javapracticeprograms;

import java.util.Scanner;

public class Prblm8_OvelOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the character you want to check its a vowel or not:");
        char c = scan.next().charAt(0);


        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println(c + " is an vowel");
            }else
                System.out.println(c + " is not an vowel");
        }

        else
            System.out.println("Enter a valid Alphabet");

    }
}
