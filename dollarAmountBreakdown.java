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
