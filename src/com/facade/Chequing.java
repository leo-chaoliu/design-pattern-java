package com.facade;

import java.math.BigDecimal;

public class Chequing extends IAccount {

    public Chequing(BigDecimal initAmount) {
        super(initAmount);
    }

    @Override
    public void deposit(BigDecimal amount) {
        
    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(BigDecimal amount) {

    }

}
