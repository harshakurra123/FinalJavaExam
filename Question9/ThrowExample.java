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
public class ThrowExample {
    public void getTaxAmount(int salary){
        if(salary<10000){
            throw new ArithmeticException("Your have no tax deductions");
        }
        else{
            System.out.println("Your tax deduction amount is" + salary*10/100);
        }
    }
}
