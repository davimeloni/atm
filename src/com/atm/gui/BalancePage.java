package com.atm.gui;

import com.atm.model.Account;

import javax.swing.*;
import java.util.stream.Stream;

public class BalancePage {

    public JPanel balancePanel;
    private JTextField accountCodeTest;

    public BalancePage(Account account) {
        accountCodeTest.setText(String.valueOf(account.getBalance()));
    }
}
