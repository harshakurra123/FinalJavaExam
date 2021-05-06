/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Harshavardhan Kurra
 */
public class Sum {
    static int sum =0;
    public static int sumOfNumbers(int value){
        if(value == 1 )
        {
            return 1;
        }
        if(value > 1)
        {
            return sum = value + sumOfNumbers(value-1);
        }
        return sum;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("answer for Question 10: Harshavardhan Kurra");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of digits: ");
        int number = scan.nextInt();
        System.out.println(sumOfNumbers(number));
    }
    
}
