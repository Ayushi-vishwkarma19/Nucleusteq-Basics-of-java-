
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Throws {
 public static void main(String []args) throws FileNotFoundException
 {
     FileInputStream fi=new FileInputStream("D:\\Demo.txt");
 }
}
