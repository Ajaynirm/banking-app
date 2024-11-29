package com.ajay.customer;

import java.util.ArrayList;

public class Bank {
     public  static  ArrayList<Customer> customers=new ArrayList<>();
     static int refCustId;
     static int refAccount;

    public Bank(ArrayList<Customer> customers){
        this.customers=customers;
    }
}
