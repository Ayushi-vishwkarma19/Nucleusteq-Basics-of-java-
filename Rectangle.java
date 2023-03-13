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
public class Rectangle extends Shape {
    
    int length,width;
    public Rectangle(int length, int width)
    {
     this.length=length;
     this.width=width;
    }

    @Override
    public void perimeter() {
       System.out.println("Perimeter of Rectangle= "+ (2*(length+width)));
    }

    @Override
    public void area() {
         System.out.println("Area of Circle= "+ (length*width));
    }
    public static void main(String []args){
        Rectangle rec=new Rectangle(2,3);
        rec.perimeter();
        rec.area();
    }
}
