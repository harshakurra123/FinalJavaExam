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
public class Clothing extends Shoe {
    int noOfItems;
    String type;
    
    public Clothing(int noOfItemsIn, String typeIn, String shoeNameIn){
        super(shoeNameIn);
        this.noOfItems = noOfItemsIn;
        this.type = typeIn;
    }
    
    public int getNoOfItems(){
        return noOfItems;
    }
    
    public String getType(){
        return type;
    }
    
    @Override
    public void getDetails(){
        System.out.println("no of items: " + getNoOfItems() + ", type of item: " + getType());
    }
}
