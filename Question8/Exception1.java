/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Harshavardhan Kurra
 */
public class Exception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("answer for Question 8: Harshavardhan Kurra");
        try{
            Scanner scan = new Scanner(new File("input.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found "+e);
        }
        
    }
    
}
