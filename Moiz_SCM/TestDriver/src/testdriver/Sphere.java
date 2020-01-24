/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdriver;

/**
 *
 * @author STD-PC
 */
public class Sphere implements Shape {

    private final double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return  Math.PI * Math.pow(radius, 3)*4/3;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

}
