/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author dell
 */
public class MapProgram {
  public static void main(String [] args)
  {
      String str="Aayushi Vishwkarma";
      char [] array={'1','1','2','3','4','1','2','3','4'};
      char []charArray= str.toCharArray();
      Map<Character,Integer> f=new HashMap<>(); 
      Map<Character,Integer> freq=new HashMap<>();
      //Map<String,Long> f = Stream.of(chars).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     for(char s:charArray)
     {
       int count=0;
       if(f.get(s)!=null)
       {
           count=f.get(s);
       }
       f.put(s,count+1);
     }
      System.out.println(f);
      for(char a:array)
      {
          int c=0;
          if(freq.get(a)!=null)
          {
              c=freq.get(a);
          }
          freq.put(a,c+1);
      }
      System.out.println(freq);
  }
}
