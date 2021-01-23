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
public class OdometerTUIStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Odometer s = new Odometer(2);
        for (int x = 0; x <101;x++){
       
        s.increment();
         System.out.println(s.toString());
        }
        s.decrement();
         System.out.println(s.toString());
         s.decrement();
         System.out.println(s.toString());
    }
    
}
