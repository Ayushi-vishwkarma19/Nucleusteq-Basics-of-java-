
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
public class CheckPin {
  public static void main(String []args)
  {
      Scanner sc=new Scanner(System.in);
      int Pin;
      System.out.println("Enter Pin.");
      Pin=sc.nextInt();
      int count=0;
      while(Pin!=0)
      {
          Pin=Pin/10;
          count++;
      }
      if(count==6)
      {
          System.out.println("Valid Pin.");
      }
      else{
          System.out.println("Invalid Pin.");
      }
  }
}
