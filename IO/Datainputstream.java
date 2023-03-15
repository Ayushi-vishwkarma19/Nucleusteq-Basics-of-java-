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
public class Datainputstream {
    public static void main(String[] args)
    {
        try
        {
            FileInputStream Fi=new FileInputStream("D:\\Demo.txt");
           DataInputStream Dis=new DataInputStream(Fi);
          // byte a=Dis.readByte();
           //short b=Dis.readShort();
           boolean c= Dis.readBoolean();
           int a=Dis.readInt();
           double b=Dis.readDouble();
           System.out.println(a+" "+b+" "+c);
           Fi.close();
           Dis.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
