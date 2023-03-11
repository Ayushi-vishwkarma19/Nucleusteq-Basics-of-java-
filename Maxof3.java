
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Maxof3 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter Three number to compare.");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x>=y&&x>=z)
        {
          System.out.println(x+"is greatest");
        }
        else if(y>=z&&y>=x)
        {
          System.out.println(y+"is greatest");
        }
        else
        {
          System.out.println(z+"is greatest");
        }
        
    }
}
