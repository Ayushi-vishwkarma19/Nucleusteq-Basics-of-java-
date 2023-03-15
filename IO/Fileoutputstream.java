/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author dell
 */
public class Fileoutputstream {
    public static void main(String[]args) throws FileNotFoundException, IOException
    {
        
        FileOutputStream fo=new FileOutputStream("D:\\Demo.txt");
        String msg="Hello, I am Ayushi Vishwkarma.";
        byte b[]=msg.getBytes();
        fo.write(b);
        fo.close();
        
    }
}
