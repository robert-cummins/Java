package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount RobsBankAccount = new BankAccount(1234, 3000, "Robert", "rob@gmail.com", 0221626262);
        BankAccount defaultAccount = new BankAccount();

        System.out.println(defaultAccount.getName());
        RobsBankAccount.depositFunds(420);
        RobsBankAccount.withdrawFunds(780);
        RobsBankAccount.withdrawFunds(3000);
        System.out.println(RobsBankAccount.getName());
        System.out.println(RobsBankAccount);
    }
}
