package com.bank.service;

import com.bank.dao.AccountDAO;
import com.bank.entity.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService {

    @Autowired
    private AccountDAO accountDAO;

    @Transactional
    public void transferMoney(int sender, int receiver, double amount) {

        Account acc1 = accountDAO.getAccount(sender);
        Account acc2 = accountDAO.getAccount(receiver);

        if(acc1.getBalance() < amount)
            throw new RuntimeException("Insufficient Balance!");

        acc1.setBalance(acc1.getBalance() - amount); 
        acc2.setBalance(acc2.getBalance() + amount);

        accountDAO.update(acc1);
        accountDAO.update(acc2);

        System.out.println("✅ Transaction Successful");
    }
}
