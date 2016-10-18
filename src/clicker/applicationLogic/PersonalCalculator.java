/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationLogic;

/**
 *
 * @author Carmen_Lucia3
 */
public class PersonalCalculator implements Calculator{
    
    int value;
    
    public PersonalCalculator(){
        this.value=0;
    }
    
    @Override
    public int giveValue(){     
        return this.value;
    }
    
    @Override
    public void increase(){
        this.value += 1;
    }
    
}
