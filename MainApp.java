package com.bank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.bank.service.BankService;
import com.bank.config.AppConfig;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BankService bankService = context.getBean(BankService.class);

        bankService.transferMoney(101, 102, 2000);  // Transfer ₹2000

        context.close();
    }
}
