/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Harshavardhan kurra
 */
public class Shopping extends Clothing {
    String category;
    
    public Shopping(String categoryIn, int noOfItemsIn, String typeIn, String shoeNameIn){
        super(noOfItemsIn, typeIn, shoeNameIn);
        this.category=categoryIn;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void getDetails(){
        System.out.println("shopping categories: " + getCategory());
    }
}
