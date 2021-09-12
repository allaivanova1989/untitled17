package study;

import java.util.Scanner;

public class Symbol {
    public void testIf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a letter:");
        String first = scanner.nextLine();
        if (first.isEmpty()) {
            System.out.println("Error:invalid value");}
        else {
            char letter = first.charAt(0);
            if (letter > 64 && letter < 91 || letter > 96 && letter < 123) {
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y' ||
                        letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y') {
                    System.out.println("This letter is a vowel");
                } else {
                    System.out.println("This letter is a consonant");
                }
            } else {
                System.out.println("This is not a letter");
            }
        }
        }

    }

