/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class SecondLargest {
    
public static int Second_Largest(int[] arr, int n){  
int tmp;  
for (int i=0;i<n;i++)   
        {  
         for (int j=i+1;j< n;j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
            }  
        }  
       return arr[n-2];  
}  
public static void main(String args[]){  
int arr[]={1,2,3,4,5,6,9,8};
int n=8;
  
int Ans=Second_Largest(arr,n);  
System.out.println("Second Largest no. is:"+Ans);
  
}}  

