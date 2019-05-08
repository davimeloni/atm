package com.atm.gui;

import com.atm.bean.AccountBean;
import com.atm.model.Account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodListener;
import java.util.stream.Stream;

public class LoginPage {

    public JPanel loginContent;

    private JPasswordField pinField;
    private JTextField accountNumberTextField;
    private JButton accessAccountButton;

    public LoginPage() {

        accessAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccountBean accountBean = new AccountBean();
                Account account = accountBean.login(accountNumberTextField.getText(), String.valueOf(pinField.getPassword()));

                System.out.println("id: " + account.getId());
                if (account.getId() != 0) {
                    JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(loginContent);

                    topFrame.setContentPane(new BalancePage(account).balancePanel);
                    topFrame.invalidate();
                    topFrame.validate();
                } else {
                    System.out.println("No account found");
                }
            }
        });
    }

}
