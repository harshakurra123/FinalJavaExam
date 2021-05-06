/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.ArrayList;

/**
 *
 * @author S542409
 */
public class ListSearch {
    public static int search(ArrayList<Integer> arr, int low, int high, int key){
        if (high < low)
        {
          return -1;
        }
        if (arr.get(low) == key)
        {
          return low;
        }
        if (arr.get(high) == key)
        {
          return high;
        }

        return search(arr, low+1, high-1, key);
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 10: Harshavardhan Kurra");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(90);
        arrayList.add(80);
        arrayList.add(70);
        arrayList.add(60);
        arrayList.add(50);
        arrayList.add(40);
        arrayList.add(30);
        int low = 0;
        int high = arrayList.size()-1;
        int key = search(arrayList, low, high, 50);
        
        if(key>-1){
            System.out.println("Element found at index "+key);
        }
        else{
            System.out.println("Element not found");
        }

    }
    
}
