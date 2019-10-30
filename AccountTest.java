package ca.ardeshir.main;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void deposite() {
        Account acc = new Account("test account", 250, 500);

        assertEquals(500,acc.deposite(250, Account.type.checking));
        assertEquals(750,acc.deposite(750, Account.type.saving));

    }

    @org.junit.jupiter.api.Test
    void withdrawl() {
        Account acc = new Account("test account", 250, 500);
        assertEquals(0, acc.withdrawl(250,Account.type.checking));
        assertEquals(0, acc.withdrawl(500, Account.type.saving));
        //test whithdraw from an empty account
        assertEquals(0, acc.withdrawl(250, Account.type.checking));
        assertEquals(0, acc.withdrawl(500, Account.type.saving));
    }

    @org.junit.jupiter.api.Test
    void getCheckingBalance() {
        Account acc = new Account("test account", 250, 500);
        assertEquals(250, acc.getCheckingBalance());
    }

    @org.junit.jupiter.api.Test
    void getSavingBalance() {
        Account acc = new Account("test account", 250, 500);
        assertEquals(250, acc.getSavingBalance());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account acc = new Account("test account" , 250, 500);
        assertEquals(250, acc.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Account acc = new Account("test account",250, 500);
        assertEquals(250, acc.getName());
    }

    @org.junit.jupiter.api.Test
    void transferMoney() {
        Account acc = new Account("test account", 250, 500);
        acc.transferMoney(Account.type.checking, Account.type.saving, 400);
        assertEquals((500 + 250 +250 * Account.interestRate), acc.getSavingBalance());

        Account account = new Account("test account", 1000, 500);
        account.transferMoney(Account.type.saving, Account.type.checking, 400);
        assertEquals(1400, account.getSavingBalance());
        assertEquals(100, account.getSavingBalance());
    }
}