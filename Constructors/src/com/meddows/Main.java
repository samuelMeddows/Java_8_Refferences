package com.meddows;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        // set up account using default constructor
        //bankAccount samsAccount = new bankAccount();

        // set up account using constructor
        bankAccount samsAccount = new bankAccount(12345, 0.00, "Sam Meddows", "meddows@gmail.com",
              "0422067813" );

        // depositing and withdrawing
        samsAccount.withdrawal(100.00);
        samsAccount.deposit(50.00);
        samsAccount.withdrawal(20.22);

        // create account with sub constructor - default account number and balance will be added
        bankAccount johnsAccount = new bankAccount("John", "john@email.com", "12345");
        System.out.println(johnsAccount.getNumber() + " name " +johnsAccount.getCustomerName());
        System.out.println("Current Balance is " + johnsAccount.getBalance());

        // withdraw from John's account
        johnsAccount.withdrawal(100.55);

        System.out.println("--------------------------------------");

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getCustomerName());

        VipCustomer person2 = new VipCustomer("Bob", 2500);
        System.out.println(person2.getCustomerName());

        VipCustomer person3 = new VipCustomer("Sam", 100.00, "sam@gmail.com");
        System.out.println(person3.getCustomerName());
        System.out.println(person3.getCustomerEmail());




    }

}
