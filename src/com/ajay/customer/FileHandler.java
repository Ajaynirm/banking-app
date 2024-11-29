package com.ajay.customer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
    private static final String fileName="bank_db.txt";
    public void initialize() throws IOException {
        ArrayList<Customer> list=new ArrayList<>();
        File file=new File(fileName);
        BufferedReader br=new BufferedReader(
                new FileReader(file)
        );

        String customerInfo= br.readLine();
        do{
            Customer customer=stringToCustomer(customerInfo);
            list.add(customer);
            customerInfo= br.readLine();
        }while (customerInfo!=null);

        Bank.customers=list;
        Bank.refCustId=list.get(list.size()-1).C;

    }
    private static Customer stringToCustomer(String customerInfo){
        String[] arr=customerInfo.split(" ");
        return new Customer(
                Integer.parseInt(arr[0]),
                Integer.parseInt(arr[1]),
                arr[2],
                Integer.parseInt(arr[3]),
                arr[4]
                );
    }
}
