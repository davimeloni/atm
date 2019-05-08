package com.atm.model;

public class Account {

    private int id;
    private String clientName;
    private int accountNumber;
    private int pin;
    private Double balance;

    public Account() {

    }

    public Account(String clientName, int accountNumber, int pin, Double balance, int id) {
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
