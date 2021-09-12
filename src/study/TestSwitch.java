package study;

import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a month:");
        String month = sc.nextLine();
        String result = month.toLowerCase();
        switch (result) {
            case "december":
            case "january":
            case "february":
                System.out.println((" The season is winter"));
                break;
            case "march":
            case "april":
            case "may":
                System.out.println((" The season is spring"));
                break;
            case "june":
            case "july":
            case "august":
                System.out.println((" The season is summer"));
                break;
            case "september":
            case "october":
            case "november":
                System.out.println((" The season is autumn"));

        }
        System.out.println("Error: month entered incorrectly");
    }
}
