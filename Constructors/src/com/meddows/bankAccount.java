package com.meddows;

public class bankAccount {

    // fields
    private int      number;
    private double   balance;
    private String   customerName;
    private String   customerEmail;
    private String   customerPhoneNumber;

    // constructor - default
    public bankAccount(){
        this(12345, 0.00, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    // constructor
    public bankAccount(int number,double balance, String customerName, String customerEmail, String customerPhoneNumber ){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // sub constructor with 2 default values
    public bankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this(9999, 100.55, customerName, customerName, customerPhoneNumber);
    }

    // deposit method
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance);
    }

    // withdraw method
    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount <0){
            System.out.println("Insufficient Balance. " + this.balance + " available.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    // setters
    public void setNumber(int number){
        this.number = number;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    public void setPhone(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // getters
    public int getNumber(){
        return this.number;
    }

    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    public String getCustomerPhoneNumber(){
        return this.customerPhoneNumber;
    }
}

