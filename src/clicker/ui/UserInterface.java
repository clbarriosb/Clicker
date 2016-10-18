/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationLogic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Carmen_Lucia3
 */
public class UserInterface implements Runnable {
    
    private JFrame frame;
    private Calculator calculator;
    
    public UserInterface(Calculator calculator) {
        this.calculator= calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);
        
        JLabel clickCount = new JLabel(String.valueOf(this.calculator.giveValue()));
        
        JButton clickButton = new JButton("Click!");
        
        ClickListener clickCalculator = new ClickListener(this.calculator, clickCount);
        clickButton.addActionListener(clickCalculator);
        
        container.add(clickCount);
        container.add(clickButton);

    }

    public JFrame getFrame() {
        return frame;
    }
}

