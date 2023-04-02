/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.*;


/**
 *
 * @author dell
 */
public class SetProgram {
 public static void main(String []args)
 {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of Array.");
    n=sc.nextInt();
        int arr[]=new int[n];
    System.out.println("Enter elements in array.");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    HashSet<Integer> s=new HashSet<Integer>();
    for(int i=0;i<n;i++)
    {
        if(!s.contains(arr[i]))
        {
            s.add(arr[i]);
        }
    }
    System.out.println("set:" +s);
 }
}
