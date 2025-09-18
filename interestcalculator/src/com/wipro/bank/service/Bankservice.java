package com.wipro.bank.service;

import com.wipro.bank.acc.Account;
import com.wipro.bank.acc.RDAccount;

public class Bankservice {

    public void calculate(float principal, int tenure, int age, String gender) {
        if (validatedata((int) principal, tenure, age, gender)) {   // ✅ Now works
            Account account = new RDAccount(tenure, principal);
            account.setinterest(age, gender);

            float interest = account.calculateinterest();
            float deposited = account.calculateamountdeposited();
            float maturity = account.calculatematurityamount(deposited, interest);

            System.out.println("Interest: " + interest);
            System.out.println("Amount Deposited: " + deposited);
            System.out.println("Maturity Amount: " + maturity);
        } else {
            System.out.println("Invalid data entered. Please check your inputs.");
        }
    }

    // ✅ Add this method
    public boolean validatedata(int principal, int tenure, int age, String gender) {
        // principal should be > 0
        if (principal <= 0) return false;

        // tenure should be 5 or 10
        if (!(tenure == 5 || tenure == 10)) return false;

        // age should be > 0
        if (age <= 0) return false;

        // gender should be male or female
        if (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) return false;

        return true; // ✅ all inputs valid
    }
}
