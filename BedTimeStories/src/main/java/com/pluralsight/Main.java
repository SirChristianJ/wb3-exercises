package com.pluralsight;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean isAskingForAnother = true;
        do{
            try{
                Scanner userInput = new Scanner(System.in);
                System.out.println("Enter the number of the story you'd like to read: \n[1]Goldilocks and the Three Bears\n[2]Hansel and Gretel\n[3]Mary Had a Little Lamb");
                int choice = userInput.nextInt();
                userInput.nextLine();
                String selectedStory = "";
                int lineNumber = 0;

                switch (choice){
                    case 1:
                        selectedStory = "goldilocks.txt";
                        break;
                    case 2:
                        selectedStory = "hansel_and_gretel.txt";
                        break;
                    case 3:
                        selectedStory = "mary_had_a_little_lamb.txt";
                        break;
                }
                System.out.println("\nYou selected: " + selectedStory);
                FileInputStream fis = new FileInputStream("src/main/" + selectedStory);
                Scanner scanner = new Scanner(fis);
                String input;

                while (scanner.hasNextLine()){
                    input = scanner.nextLine();
                    lineNumber++;
                    System.out.println(lineNumber + ".\t\t" +input);
                }
                System.out.println("Would you like another story ? (Press N , E or Q to quit)");
                String userWantsAnother = userInput.nextLine();
                if(userWantsAnother.equalsIgnoreCase("n")
                        || userWantsAnother.equalsIgnoreCase("e")
                        || userWantsAnother.equalsIgnoreCase("q")) {

                    scanner.close();
                    isAskingForAnother = false;
                    System.out.println("Exiting...");
                }

            }catch (IOException e){
                System.out.println(e.getMessage());
                System.out.println("\n-Try again!-\n");

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("\n-Please enter a number!-\n");

            }
        }while (isAskingForAnother);
    }
}