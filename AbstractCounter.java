/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author HENRY
 */
public abstract class AbstractCounter implements Counter {
    public int value;
    public AbstractCounter (){
        value = 0;
    }
    public void setValue(int x){
        value=x;
    }
    public int getValue(){
        return value;
    }
    public String count(){
        return""+value;
    }
    @Override
    public abstract void increment();
    @Override
    public abstract void decrement();
    
}
