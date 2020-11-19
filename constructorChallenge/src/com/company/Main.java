package com.company;

public class Main {

    public static void main(String[] args) {
	    VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
	    VipCustomer person2 = new VipCustomer("Rob", 20000);
        System.out.println(person2.getName());
        VipCustomer person3 = new VipCustomer("Beth", 30000, "Beth@hotmail.com");
        System.out.println(person3.getName());
    }
}
