package com.pluralsight;
import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException{

        /*int ID = PromptForInt("Enter your employee ID:");
        String name = PromptForString("Enter employee name:");
        double hoursWorked = PromptForDouble("Enter Hours Worked:");
        double pay = PromptForDouble("Enter pay rate:");*/

            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;
            bufferedReader.readLine();

            while ((input = bufferedReader.readLine()) != null){
                String[] tokens = input.split(Pattern.quote("|"));
                int employeeID = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee test = new Employee(employeeID,name,hoursWorked,payRate );
                test.getGrossPay();
                display(test);
            }

            bufferedReader.close();



    }

    public static void display(Employee e){
        System.out.printf("%s your gross pay this period is %.2f\n", e.getName(), e.getGrossPay());
    }

    /*public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int PromptForInt(String prompt){
        System.out.print(prompt);
        int userinput = scanner.nextInt();
        scanner.nextLine();
        return  userinput;
    }

    public static double PromptForDouble(String prompt){
        System.out.print(prompt);
        double userinput = scanner.nextDouble();
        scanner.nextLine();
        return  userinput;
    }*/

}