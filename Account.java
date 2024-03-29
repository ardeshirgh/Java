package ca.ardeshir.main;

import javax.xml.datatype.DatatypeConfigurationException;

public class Account {


    private String name;
    private double checkingBalance;
    private double savingBalance;

    public enum type {checking, saving}

    public static final double interestRate = 0.01;

    public Account(){
        this("unknown", 0d, 0d);
    }


    public Account(String name, double CheckingBalance, double SavingBalance) {
        this.name = name;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
    }

    public double deposite(double amount, type account) {



        if(account == type.checking){
            if(amount < 0) {
                System.out.println("the amount can not be negative");
                return this.checkingBalance;
            }

            this.checkingBalance += amount;
            return checkingBalance;
        } else if (account == type.saving){
            if(amount < 0) {
                System.out.println("the amount can not be negative");
                return this.savingBalance;
            }

            this.savingBalance += amount;
            return savingBalance;
        }
        else{
            return -1;
        }


    }



    public double withdrawl (double amount, type account){

        if(account == type.checking){

            if(amount < 0) {
                System.out.println("You can not withdraw negative amount");
                return this.checkingBalance;
            }

            this.checkingBalance -= amount;
            return checkingBalance;

        } else if(account == type.saving) {
            if(amount < 0) {
                System.out.println("You can not withdraw negative amount");
                return this.savingBalance;
            }

            this.savingBalance -= amount;
            return savingBalance;

        } else{

            return -1;

        }
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void transferMoney (type from, type to, double amount){


        if(from == type.checking && to ==  type.saving){

            if(checkingBalance >= amount){
                //can transfer the money
                this.checkingBalance -= amount;
                this.savingBalance += amount + amount*interestRate;
            } else{
                System.out.println("insufficient money, you have : " + this.checkingBalance + " in your account");
            }

        }

        if(from == type.saving && to ==  type.checking){

            if(savingBalance >= amount){
                //can transfer the money
                this.savingBalance -= amount;
                this.checkingBalance += amount;
            } else{
                System.out.println("insufficient money, you have : " + this.savingBalance + " in your account");
            }

        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", checkingBalance=" + checkingBalance +
                ", savingBalance=" + savingBalance +
                '}';
    }
}