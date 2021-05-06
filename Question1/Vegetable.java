/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Harshavardhan Kurra
 */
public class Vegetable extends Food {
    
    String nutrients;

    public Vegetable(String nutrients,String vitamins) {
        super(vitamins);
        this.nutrients = nutrients;
    }
    
    
    @Override
    public void getNutrients() {
        System.out.println("nutrients in food are: " + nutrients);
    }
}
