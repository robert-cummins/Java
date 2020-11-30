package com.company;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(2322, 0, "default", "default", 555);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, int balance, String name) {
        this(accountNumber, balance, name, "default", 555);
    }

    public BankAccount(int accountNumber, int balance, String name, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getEmail(){
        return this.email;
    }

    public String getName(){
        return this.name;
    }

    public void depositFunds(int amount){
        this.balance += amount;
        System.out.println("Your new balance is " + getBalance());
    }

    public void withdrawFunds(int amount){
        if(amount > this.balance){
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            System.out.println("Your new balance is " + getBalance());
        }

    }
}
