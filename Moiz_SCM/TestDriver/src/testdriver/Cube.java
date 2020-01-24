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
public class Cube implements Shape {

    private double length;

    Cube(double length) {
        this.length = length;
    }

    public double volume() {
        return Math.pow(length, 3);
    }

    public double area() {
        return 6 * Math.pow(length, 2);
    }

}
