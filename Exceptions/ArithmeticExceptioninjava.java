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
public class ArithmeticExceptioninjava {
    public static void main(String []args)
    {
       try
       {
        int num1=12,num2=0;
        int divide=num1/num2;
        System.out.println(divide);
       }catch(ArithmeticException e)
       {
           System.out.println("Exception is: "+ e);
       }
        

    }
}
    
