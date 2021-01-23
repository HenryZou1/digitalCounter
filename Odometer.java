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
public class Odometer {
    DigitalCounter left = new DigitalCounter();
    LinkedDigitCounter[] rightCount= new LinkedDigitCounter[1000];
    int num =0;
    public Odometer(int x) {
      num =x;
      rightCount[0] = new LinkedDigitCounter(left);
      for (int i =1; i<x-1; i ++)
       rightCount[i] = new LinkedDigitCounter(rightCount[i-1]);
    }
    public void increment(){
        rightCount[num-2].increment();
    }
    public void decrement(){
        rightCount[num-2].decrement();
    }
    public String toString(){
        StringBuffer s = new StringBuffer("");
        s.insert(0, left.count());
        for (int i =0; i<num-1; i ++)
            s.insert(0,rightCount[i].count());
        
        s.reverse();
        return s.toString();
    }
}
