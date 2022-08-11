package com.bridgelabz.bankfunctions;

import java.util.Scanner;

public class Account {
    String firstName;
    String lastName;
    String city;
    String state;
    String mobNumber;
    int balance;
    Scanner sc = new Scanner(System.in);

    public Account(String firstName,String lastName,String city,String state,String mobNumber,int balance)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.city=city;
        this.state=state;
        this.mobNumber=mobNumber;
        this.balance=balance;

    }
    public int addAmount()
    {
        int amount;
        System.out.println("please enter amount to be added");
        amount=sc.nextInt();
        balance=balance+amount;
        return balance;

    }
    public int withdrawAmount()
    {
        int amount;
        System.out.println("please enter amount to be withdraw");
        amount=sc.nextInt();
        balance=balance-amount;
        return balance;

    }


    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", mobNumber='" + mobNumber + '\'' +
                '}';
    }
}
