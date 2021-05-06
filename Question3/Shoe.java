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
public class Shoe {
    String shoeName;
    
    public Shoe(String shoeNameIn){
        this.shoeName=shoeNameIn;
    }
    
    public void getDetails(){
        System.out.println("shoe name is: "+ shoeName);
    }
}
