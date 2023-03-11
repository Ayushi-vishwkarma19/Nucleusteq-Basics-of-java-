
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
public class Currency_Conversion {
    
    
    public static void main(String []args)
    {
        int value;
        String Country;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value:");
        value=sc.nextInt();
        System.out.println("Enter Country:");
        Country=sc.next();
        switch(Country)
                {
            case"India":
                System.out.println("Currency ="+value+"Rs");
                break;
                
            case"US":
                System.out.println("Currency ="+value+"$");
                break;
            case"Canada":
                System.out.println("Currency ="+value+"C$");
                break;
            case"Australia":
                System.out.println("Currency ="+value+"A$");
                break; 
             case"Swedish":
                System.out.println("Currency ="+value+"kr");
                break;    
                }
    }
}
