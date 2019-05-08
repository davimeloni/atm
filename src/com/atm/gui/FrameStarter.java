package com.atm.gui;

import javax.swing.*;
import java.awt.*;

public class FrameStarter extends JFrame {

    public FrameStarter() throws HeadlessException {

    }

    public void changePanel(JPanel panel) {
        setContentPane(panel);
        invalidate();
        validate();
    }

    public static void main(String[] args) {
        FrameStarter frameStarter = new FrameStarter();
        frameStarter.setContentPane(new LoginPage().loginContent);
        frameStarter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameStarter.pack();
        frameStarter.setVisible(true);
    };
}
