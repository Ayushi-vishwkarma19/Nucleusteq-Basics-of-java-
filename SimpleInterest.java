
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
public class SimpleInterest {
    public static void main(String []args)
    {
     Scanner sc=new Scanner(System.in);
    int a,b,c;
    int SI;
    
    System.out.println("Enter First number");
    a=sc.nextInt();
    
    b=sc.nextInt();
    
    c=sc.nextInt();
  SI=(a*b*c)/100;
   System.out.println(SI);
    }
}
