/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Arraylist {
    public static void main(String [] args)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of Elements.");
        int n=sc.nextInt();
        System.out.println("Enter the elements of ArrayList.");
        for(int i=0;i<n;i++)
        {
         int ele=  sc.nextInt();
           al.add(ele);
        }
         HashSet<Integer> h=new HashSet(al);
        System.out.println("ArrayList with duplicate elements:"+ al);
        System.out.println("Arraylist having unique elements:"+ h);
    }
}
