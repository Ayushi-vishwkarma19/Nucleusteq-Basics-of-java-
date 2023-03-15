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
public class ObjectOutputstream {
    public static void main(String []args)// throws FileNotFoundException
    {
        String s="Ayushi Vishwkarma";
        char[]arr={'A','B','C','D'};
        try{
            FileOutputStream fo=new FileOutputStream("D:\\Demo.txt");
            ObjectOutputStream O=new ObjectOutputStream(fo);
            O.writeObject(s);
            O.writeObject(arr);
            fo.close();
            O.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
