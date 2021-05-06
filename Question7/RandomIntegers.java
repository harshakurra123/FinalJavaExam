/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author Harshavardhan Kurra
 */
public class RandomIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 7: Harshavardhan Kurra");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index of the array");
        int index = scan.nextInt();
        int[] intArray = new int[100];
        for(int i=0; i<100; i++){
            intArray[i] = (int)Math.floor(Math.random()*100);
        }
        
        if(index > -1 && index < 100){
            System.out.println("corresponding element value is: " + intArray[index]);
        }
        else{
            System.out.println("message out of bounds");
        }
    }
    
}
