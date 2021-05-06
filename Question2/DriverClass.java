/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

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
        System.out.println("Answer for question 2: Harshavardhan Kurra");

        GeometricObject[] geometricObjects = new GeometricObject[5];

        geometricObjects[0] = new Square(10.5, true);
        geometricObjects[1] = new Square(4.2, true);
        geometricObjects[2] = new Square(7.1, false);
        geometricObjects[3] = new Square(16.2, false);
        geometricObjects[4] = new Square(7.3, true);

        for (GeometricObject geometric : geometricObjects) {
            System.out.println("Area is: " + geometric.calculateArea());
            if (geometric.isColorable() == true) {
                Square square = (Square) geometric;
                square.howToColor();
            }
        }


    }
    
}
