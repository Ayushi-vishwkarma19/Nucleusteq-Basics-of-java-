/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.io.*;

/**
 *
 * @author dell
 */
public class FilenotFoundException {
    public static void main(String []args) throws IOException
    {
        try
        {
            FileInputStream fi=new FileInputStream("D:\\Ayu.txt");
            fi.read();
        }catch(FileNotFoundException e)
        {
            System.out.println(e);
        }catch(IOException e)
        {
            System.out.println("Second Exception :"+e);
        }
    }
}
