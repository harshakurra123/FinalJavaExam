/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author Harshavardhan Kurra
 */
public class ThrowDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 9: Harshavardhan Kurra");

        try{
            ThrowExample throwExample = new ThrowExample();
            throwExample.getTaxAmount(20000);
            throwExample.getTaxAmount(5000);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        
    }
    
}
