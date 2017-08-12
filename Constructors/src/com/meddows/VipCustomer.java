package com.meddows;

public class VipCustomer {

    // fields
    private String customerName;
    private double customerCreditLimit;
    private String customerEmail;

    // default constructor (1st for challenge)
    public VipCustomer() {
        this("Default name", 50000.00, "default@email.com");
    }

    // 2 value constructor (2nd for challenge)
    public VipCustomer(String customerName, double customerCreditLimit) {
        this(customerName, customerCreditLimit, "default@email.com");
    }

    // main constructor (3rd for challenge)
    public VipCustomer(String customerName, double customerCreditLimit, String customerEmail) {
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmail = customerEmail;
    }

    // getters
    public String getCustomerName() {
        return customerName;
    }
    public double getCustomerCreditLimit() {
        return customerCreditLimit;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
}

