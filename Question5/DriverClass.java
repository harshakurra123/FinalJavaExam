/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Harshavardhan Kurra
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 5: Harshavardhan Kurra");
        ComparableCircle circle1 = new ComparableCircle(10.4);
        ComparableCircle circle2 = new ComparableCircle(4.3);
        System.out.println(circle1.compareTo(circle2) > 0);
        System.out.println(circle2.compareTo(circle1) > 0);
        System.out.println("Area of circle1: "+circle1.calculateCircleArea());
        System.out.println("Area of circle2: "+circle2.calculateCircleArea());
        if (circle1.compareTo(circle2) == 0) {
            System.out.println("circles circle1 and circle2 have same area");
        } else if (circle1.compareTo(circle2) > 0) {
            System.out.println("Area of circle circle1 is greater than circle2");
        } else {
            System.out.println("Area of circle circle2 is greater than circle1");
        }
    }
    
}
