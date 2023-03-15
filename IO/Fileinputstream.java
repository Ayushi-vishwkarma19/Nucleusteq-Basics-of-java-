/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;
import java.io.FileInputStream;
/**
 *
 * @author dell
 */
public class Fileinputstream {
    public static void main(String[] args)
    {
    try{
    FileInputStream F=new FileInputStream("D:\\Demo.txt");
    int i=0;
    while((i=F.read())!=-1)
    {
    
    System.out.print((char)i);
    }
    F.close();
      }catch(Exception e)
      {
          System.out.println(e);
      }
    }
    
}
