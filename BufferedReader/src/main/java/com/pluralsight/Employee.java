package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeId, String name, double hoursWorked, double payRate){
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate){
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getGrossPay(){
        /*System.out.println("\n\nEmployee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate:" + payRate);*/

        double extraHours = hoursWorked - 40;          //get overtime hours
        double normalHours = hoursWorked - extraHours; //get normal hours not including OT
        double grossPay = 0;

        //System.out.print("Your calculated gross pay is: $");
        if(hoursWorked > 40){
            grossPay = ((normalHours*payRate)+(extraHours)*(payRate*1.5));
            //System.out.printf("%.2f" ,((normalHours*payRate)+(extraHours)*(payRate*1.5)));
        }

        else {
            grossPay = hoursWorked * payRate;
            //System.out.printf("%.2f", hoursWorked * payRate);
        }
        return grossPay;

    }
}
