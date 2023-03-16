/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author dell
 */
public class NumberformatException {
    public static void main(String []args)
    {
        try
        {
            int a=12;
            int b=Integer.parseInt("Ayushi");
            int sum=a+b;
            System.out.println(sum);
            
        }catch(NumberFormatException e)
        {
            System.out.println("Exception is: "+e);
        }
    }
}
