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
public class ThrowsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ThrowsExample throwsExample = new ThrowsExample();
            throwsExample.getAgeRestriction(20);
            throwsExample.getAgeRestriction(16);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        
    }
    
}