/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;
import java.io.*;
/**
 *
 * @author dell
 */
public class Dataoutputstream {
  public static void main(String []args)
  {
      try{
          DataOutputStream Dos=new DataOutputStream(new FileOutputStream("D:\\Demo.txt"));
          Dos.writeDouble(15.2);
          Dos.writeInt(45);
          Dos.writeBoolean(true);
          Dos.close();
          
      }catch(Exception e)
      {
          System.out.println(e);
      }
      
  }
}
