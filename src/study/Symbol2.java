package study;

import java.util.Scanner;

public class Symbol2 {
    public void testSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a letter:");
        String first = scanner.nextLine();
        if (first.isEmpty()) {
            System.out.println("Error:invalid value");
        } else {
            char letter = first.charAt(0);
            if (letter > 64 && letter < 91 || letter > 96 && letter < 123) {
                switch (letter) {
                    case 'A':
                    case 'a':
                    case 'E':
                    case 'e':
                    case 'I':
                    case 'i':
                    case 'y':
                    case 'Y':
                    case 'u':
                    case 'U':
                    case 'o':
                    case 'O':

                        System.out.println("This letter is a vowel");
                        break;
                    default:
                        System.out.println("This letter is a consonant");
                }
            } else {
                System.out.println("This is not a letter");
            }
        }
    }
}
