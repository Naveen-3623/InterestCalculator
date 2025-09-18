package com.wipro.bank.acc;

public class RDAccount extends Account {
    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }
    @Override
    public float calculateinterest() {
        // Simple interest formula (demo)
        return (principal * tenure * rateofinterest) / 100;
    }
    @Override
    public float calculateamountdeposited() {
        return (principal * tenure * 12);
    }
}