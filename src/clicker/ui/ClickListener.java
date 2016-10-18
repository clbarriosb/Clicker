/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationLogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Carmen_Lucia3
 */
public class ClickListener implements ActionListener {

    private JLabel jLabel;
    private Calculator calculator;
    
    public ClickListener(Calculator calculator, JLabel jLabel){
        this.jLabel = jLabel;
        this.calculator= calculator;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.calculator.increase();
        this.jLabel.setText(String.valueOf(this.calculator.giveValue()));         
    }
    
}
