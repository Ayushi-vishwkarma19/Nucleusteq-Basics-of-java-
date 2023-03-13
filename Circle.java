/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Example;

/**
 *
 * @author dell
 */
public class Circle extends Shape {
    int radius;
    public Circle(int radius)
    {
        this.radius=radius;
    }
    @Override
    public void perimeter() {
        System.out.println("Perimeter of circle= "+ (2*3.14*radius));
    }

    @Override
    public void area() {
       System.out.println("Area of Circle= "+ (3.14*radius*radius));
    }
    public static void main(String[] args)
    {
        Circle A=new Circle(4);
        A.perimeter();
        A.area();
        
    }
}
