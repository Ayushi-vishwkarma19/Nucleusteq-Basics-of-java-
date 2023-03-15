/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Throw {
    public static void main (String []args)
    {
        int a=12,b=18,c;
       
            c=a/b;
            if(b>a)
            {
                throw new ArithmeticException("b is greater than a.");
            }
        
    }
    
}
