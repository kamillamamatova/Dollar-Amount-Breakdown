import java.util.Scanner;

public class HW1{
    public static void main(String[] args){
        double amount;
        int hundreds, fifties, twenties, tens, fives, ones, quarters, dimes, nickels, cents;

        Scanner myScanner = new Scanner(System.in);

        // Asks the user to enter a dollar amount
        System.out.print("Enter your dollar amount: ");
        amount = myScanner.nextDouble();

        // Converts a dollar amount into an integer representation of cents
        int total = (int)Math.round(amount * 100);

        System.out.println("\nYou have: \n");

        // Calculate the dollar amount in different terms and print it out
        hundreds = total / 10000;
        System.out.println("\t-\t" + hundreds + " hundred(s)");
        total = total % 10000;

        fifties = total / 5000;
        System.out.println("\t-\t" + fifties + " fifty(s)");
        total = total % 5000;

        twenties = total / 2000;
        System.out.println("\t-\t" + twenties + " twenty(s)");
        total = total % 2000;

        tens = total / 1000;
        System.out.println("\t-\t" + tens + " ten(s)");
        total = total % 1000;

        fives = total / 500;
        System.out.println("\t-\t" + fives + " five(s)");
        total = total % 500;

        ones = total / 100;
        System.out.println("\t-\t" + ones + " one(s)");
        total = total % 100;

        quarters = total / 25;
        System.out.println("\t-\t" + quarters + " quarter(s)");
        total = total % 25;

        nickels = total / 5;
        dimes = total / 10;
        System.out.println("\t-\t" + dimes + " dime(s)");
        total = total % 10;
