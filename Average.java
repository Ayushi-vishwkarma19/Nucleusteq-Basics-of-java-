
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
public class Average {
      public static void main(String []args)
    {
     Scanner sc=new Scanner(System.in);
    int a,b,c;
    int avg;
    
    System.out.println("Enter First number");
    a=sc.nextInt();
     System.out.println("Enter Second number");
    b=sc.nextInt();
    System.out.println("Enter Third number");
    c=sc.nextInt();
   avg=(a+b+c)/3;
   System.out.println(avg);
    }
    
}
