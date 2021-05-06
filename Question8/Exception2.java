/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import java.util.Scanner;

/**
 *
 * @author S542409
 */
public class Exception2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        // TODO code application logic here
        System.out.println("Enter the value: ");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int array[]=new int[5];
        System.out.println("Enter the index: ");
        int index = scan.nextInt();
        try{
            int result = 50/value;
            System.out.println("result is: " + result);
            array[index] = result;
            System.out.println("array is: " + array);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }
    
}
