package com.mycompany.adapterdemo1;

import com.mycompany.adapterdemo.Shape.Triangle;
import com.mycompany.adapterdemo.Shape.TriInterface;
import com.mycompany.adapterdemo.Shape.Adapter;
import com.mycompany.adapterdemo.Shape.RectInterface;

public class AdapterDemo1 {

    public static void main(String[] args) {
        System.out.println("*** A Adapter demo 1 ***");
        TriInterface triangle = new Triangle(5, 4);
        
        RectInterface rect = new Adapter(triangle);
        
        rect.aboutMe();
        
        System.out.println("The area is: " + rect.calculateArea());
    }
}
