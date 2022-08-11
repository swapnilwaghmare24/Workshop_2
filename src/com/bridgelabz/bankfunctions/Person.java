package com.bridgelabz.bankfunctions;

import java.util.LinkedList;

public class Person {

    void addData() {
        LinkedList<Account> linkedList = new LinkedList<>();

        Account account1 = new Account("Swapnil", "Waghmare", "Pune", "maharastra", "1234567", 5000);
        Account account2 = new Account("Sandip", "Waghmare", "Hingoli", "maharastra", "76528373", 8000);
        linkedList.add(account1);
        linkedList.add(account2);
        System.out.println(linkedList);
        System.out.println("The account balance of "+account1.firstName+" is "+account1.addAmount());
        System.out.println("The account balance of "+account2.firstName+" is "+account2.addAmount());
        System.out.println("The account balance of "+account1.firstName+" is "+account1.withdrawAmount());
        System.out.println("The account balance of "+account2.firstName+" is "+account2.withdrawAmount());
    }

}

