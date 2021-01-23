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
public class LinkedDigitCounter extends AbstractCounter {

    private Counter leftNeighbor;

    public LinkedDigitCounter(Counter c) {
        super();
        leftNeighbor = c;
        
    }

    @Override
    public void increment() {
        if (value < 9) {
            
            value = value + 1;
  
        } else {
            value = 0;
            leftNeighbor.increment();

        }
       
    }

    @Override
    public void decrement() {
        if (value > 0) {
            value = value - 1;
        } else {
            value = 9;
            leftNeighbor.decrement();
        }

    }

    public void reset() {
        value = 0;
    }
}
