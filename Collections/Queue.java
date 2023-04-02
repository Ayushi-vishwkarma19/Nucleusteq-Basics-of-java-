/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author dell
 */
public class Queue {
    public static void main(String [] args)
    {
       LinkedList<Integer> queue=new LinkedList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("Queue"+queue);
        int n=queue.size();
        if(queue.size()==0)
        {
          System.out.println("Empty Queue");
        }
        System.out.println("Enter the value of k where k is the no. of elements to be reversed");
        int k=sc.nextInt();
        if(k<=0)
        {
            System.out.println("Error!");
        }
       
        for(int i=0;i<k;i++)
        {
           stack.push(queue.peek());
           queue.remove();
        }
      while(!stack.empty())
      {
          queue.add(stack.peek());
          stack.pop();
      }
      for(int i=0;i<queue.size()-k;i++)
      {
          queue.add(queue.peek());
          queue.remove();
      }
      System.out.println(queue);
    }
}
