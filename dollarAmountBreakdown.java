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
        
