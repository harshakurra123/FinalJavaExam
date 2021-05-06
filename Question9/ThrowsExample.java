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
public class ThrowsExample {
    public void getAgeRestriction(int age) throws ArithmeticException {
        if(age<18){
            throw new ArithmeticException("Your age is less than 18");
        }
        else{
            System.out.println("Thanks for shopping in hyvee");
        }
    }
}
