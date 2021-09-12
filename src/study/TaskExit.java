package study;

import java.util.Scanner;

public class TaskExit {
    public void testExit() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input a word to exit:");
        for (; ; ) {
            String word = scanner1.next();
            if ( word.equalsIgnoreCase("exit")) {
                System.out.println("The word to exit is accepted ");
                return;
            }
            System.out.println(word);
            System.out.println("This word is not correct.Input another word to exit:");


        }
    }

}



