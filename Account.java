package com.bank.entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name="acc_no")
    private int accNo;

    private String name;

    @Column(name="_balance")
    private double balance;

    public int getAccNo() { return accNo; }
    public void setAccNo(int accNo) { this.accNo = accNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
