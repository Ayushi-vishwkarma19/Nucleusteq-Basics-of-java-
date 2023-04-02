/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class MenuProgram {

    public static void main(String args[])
    {
      int choice;
      int n;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of ArrayList.");
        n=sc.nextInt();
        ArrayList <Integer>Al=new ArrayList<Integer>(n);
      do
      {
      System.out.println("Press 1: To add elements.");
      System.out.println("Press 2: To remove element.");
      System.out.println("Press 3: To display elements.");
      System.out.println("Press 4: Exit.");
      System.out.println("Enter your choice");
      MenuProgram obj=new MenuProgram();
      choice=sc.nextInt();
      switch(choice)
      {
          case 1:
                   System.out.println("Enter the elements.");
                 for(int i=0;i<n;i++)
                  {
                    int ele=sc.nextInt();
                     Al.add(ele);
          
                   }
                  break;
          case 2:System.out.println("Enter the index of element to be removed");
                 int i=sc.nextInt();
                 Al.remove(i);
                 System.out.println("Element is removed Successfully.");
                  break;
          case 3: System.out.println("Elements of ArrayList:" +Al);
                  break;
          case 4: System.exit(0);
                  break;
          default: System.out.println("Incorrect Choice");
                   break;
      }
      }while(true);
      
    }
}
