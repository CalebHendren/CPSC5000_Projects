package com.mycompany.areatester;
import java.awt.Rectangle;

/**
 *
 * @author Caleb Hendren
 */
public class AreaTester {

    public static void main(String[] args) {
        Rectangle box = new Rectangle(5,10,20,30);
        System.out.println("Width: " + box.getWidth());
        System.out.println("Height: " + box.getHeight());
        System.out.println("Expected Area: " + box.width * box.height);
        
    }
}
