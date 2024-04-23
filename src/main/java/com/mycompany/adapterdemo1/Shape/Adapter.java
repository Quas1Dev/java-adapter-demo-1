package com.mycompany.adapterdemo1.Shape;

public class Adapter implements RectInterface {
    TriInterface triangle;

    public Adapter(TriInterface triangle) {
        this.triangle = triangle;
    }
    
    @Override
    public void aboutMe() {
        triangle.aboutTriangle();
    }

    @Override
    public double calculateArea() {
        return triangle.calculateTriangleArea();
    }
    
}
