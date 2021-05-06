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
public abstract class GeometricObject {
    private boolean colorable;

    public GeometricObject(boolean colorable) {
        this.colorable = colorable;
    }

    public boolean isColorable() {
        return colorable;
    }

    public abstract double calculateArea();

}
