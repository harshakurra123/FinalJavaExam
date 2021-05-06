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
public class FoodDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 1: Harshavardhan Kurra");
        Vegetable vegetable = new Vegetable("vitamins,carbohydrates,water", "A,C,E");
        vegetable.getNutrients();
        vegetable.getVitamins();
    }
    
}
