package com.ajay.customer;

public class Customer {
    private int CustId;
    private int AccountNo;
    public String Name;
    private int Balance;
    private String EncryptedPwd;
  public Customer(int custId,int AccountNo,String Name,int Balance,String EncryptedPwd){
      this.CustId=custId;
      this.Name=Name;
      this.AccountNo=AccountNo;
      this.Balance=Balance;
      this.EncryptedPwd=EncryptedPwd;
  }
}
