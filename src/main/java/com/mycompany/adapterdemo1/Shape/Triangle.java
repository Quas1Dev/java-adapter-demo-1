package com.mycompany.adapterdemo1.Shape;

public class Triangle implements TriInterface {
    double baseLength;
    double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }
    
    @Override
    public void aboutTriangle() {
        System.out.println("Shape type: Triangle");
    }

    @Override
    public double calculateTriangleArea() {
        return 0.5 * baseLength * height;
    }
    
}
