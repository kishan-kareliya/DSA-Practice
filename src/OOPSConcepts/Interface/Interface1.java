package OOPSConcepts.Interface;

import java.util.Scanner;

interface Shape{
    void calculateArea();
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Circle area calculated: " + area);
    }
}

class Rectangle implements Shape{
    private double length,width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
        double area = length*width;
        System.out.println("Rectangle area: " + area);
    }
}

public class Interface1 {
    public static void main(String args[]){
        Circle c = new Circle(25.2);
        Rectangle r = new Rectangle(12,20);

        c.calculateArea();
        r.calculateArea();
    }
}
