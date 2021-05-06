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
public abstract class Food {
    String vitamins;

    public Food(String vitamins) {
        this.vitamins = vitamins;
    }
    
    public void getVitamins() {
        System.out.println("vitamins in food are: " + vitamins);
    }
    
    public abstract void getNutrients();
}
