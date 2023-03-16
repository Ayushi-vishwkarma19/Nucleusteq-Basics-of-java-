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
public class NullpointerException {
    public static void main(String [] args)
    {
        try
        {
          String s=null;
          System.out.println(s.charAt(2));
        }catch(NullPointerException e)
        {
            System.out.println("Exception is: "+ e);
        }
    }
}
