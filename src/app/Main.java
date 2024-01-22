package app;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    static double km = 0;
    static double miles = 0;

    public static void main(String[] args) {
        valueInput();
        valueOutput();
    }

    public static void valueInput() {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        System.out.println("Welcome to \"Miles to Km\" converter!\nPlease, enter your mile value : ");
        miles = input.nextDouble();

        input.close();
    }

    public static void valueOutput() {
        km = converter(miles);
        System.out.printf("Your km value equals \"%.3f\"", km);
    }

    public static double converter(double miles) {
        return miles / 1.609;
    }
}
