package org.example;

public class Rectangle {
    double width;
    double height;

    public Rectangle (double wide, double high){
        width = wide;
        height = high;
    }

    public void getArea(double width, double height) {
        System.out.println("The area is " + (width * height));
    }

    public void getPerimeter(double width, double height) {
        System.out.println("The perimeter is " + (2 * (width + height)));
    }
}
