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
public class Palindrome {
    public static boolean isPalindrome(String str, int a, int b){
        if (a == b)
            return true;
  
        if ((str.charAt(a)) != (str.charAt(b)))
            return false;
  
        if (a < b + 1)
            return isPalindrome(str, a + 1, b - 1);
  
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 10: Harshavardhan Kurra");
        System.out.println("Enter the string:");
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        int length = string.length();
        if (length == 0){
            System.out.println("string is palindrome");
        }
        else{
            boolean status = isPalindrome(string, 0, length - 1);
            if (status){
                System.out.println("string is palindrome");
            }
            else{
                System.out.println("string is not palindrome");
            }
        }
        
        
        
    }
    
}
