package com.pluralsight;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] quotes = {"Success is not final, failure is not fatal: It is the courage to continue that counts.",
        "In the end, we will remember not the words of our enemies, but the silence of our friends.",
        "Your time is limited, so don’t waste it living someone else’s life." ,
        "It does not matter how slowly you go as long as you do not stop.",
        "The best way to predict the future is to invent it." ,
        "Life is what happens when you’re busy making other plans.",
        "Do not watch the clock. Do what it does. Keep going.",
        "The secret of getting ahead is getting started." ,
        "Believe you can and you’re halfway there."};
        boolean anotherQuote = true;

        do{
            try {
                System.out.println("Pick a number between 1 and 10");
                int choice = scanner.nextInt();
                choice--;
                scanner.nextLine();

                System.out.println("Your quotes is: " + quotes[choice]);
                System.out.print("\nWould you like to view another quote ? (Press N, E or Q to escape): ");
                String userWantsAnother = scanner.nextLine();

                if (userWantsAnother.equalsIgnoreCase("n")
                    || userWantsAnother.equalsIgnoreCase("e")
                    || userWantsAnother.equalsIgnoreCase("q")) {
                    System.out.println("Exiting ...");
                    anotherQuote = false;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\nInvalid choice. Try again!\n");
            } catch (InputMismatchException e){
                System.out.println("\nPick a number!\n");
                scanner.nextLine();
            } catch (IllegalArgumentException e){
                System.out.println("\n Try Again! \n");
            }

        }while (anotherQuote);





    }
}