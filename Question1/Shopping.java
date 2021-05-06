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
public class Shopping implements Electronics, Clothing {
    int price;
    String type;
    String category;
    String subCategory;
    
    public Shopping(int priceIn, String typeIn, String categoryIn, String subCategoryIn){
        this.price = priceIn;
        this.type = typeIn;
        this.category = categoryIn;
        this.subCategory = subCategoryIn;
    }
    
    
    @Override
    public void getPrice(){
        System.out.println("The price of item is: " + price);
    }
    
    @Override
    public void getType(){
        System.out.println("The type of item is: " + type);
    }
    
    @Override
    public void getCategory() {
        System.out.println("The category of item is: " + category);
    }
    
    @Override
    public void getSubCategory() {
        System.out.println("The sub category of item is: " + subCategory);
    }
}
