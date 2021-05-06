/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Harshavardhan Kurra
 */
public class DownCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 3: Harshavardhan Kurra");
        Shoe shoe = new Shoe("puma");
        shoe.getDetails();
        Clothing clothing = new Clothing(100, "sneakers", "nike");
        clothing.getDetails();
        Shopping shopping = new Shopping("multiple", 200, "flipflops", "adidas");
        shopping.getDetails();
        
        shoe = clothing;
        clothing = (Clothing) shoe;
        clothing.getDetails();
        
        shoe = shopping;
        shopping = (Shopping) shoe;
        shopping.getDetails();
    
    }
    
}
