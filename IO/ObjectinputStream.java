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
public class ObjectinputStream {
   public static void main(String[]args)
   {
       try{
           ObjectInputStream Oi=new ObjectInputStream(new FileInputStream("D:\\Demo.txt"));
           String str=(String)Oi.readObject();
           char[] arr1=(char[])Oi.readObject();
           String s=new String (arr1);
           System.out.println(str+" "+s);
           Oi.close();
       }catch(Exception e)
       {
           System.out.println(e);
       }
   }
}
