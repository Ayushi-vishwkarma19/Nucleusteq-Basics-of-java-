/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Employee implements Serializable {
    int id;
    String name;
    float salary;
    String email;
    long phone;
 // ArrayList<Employee>al =new ArrayList<Employee>();
    public Employee(int id,String name,String email,long phone,float salary)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
    }
    public String toString()
    {
        return "Employees Data: ID= "+id+" Name= "+name+" Email= "+email+" Phone no.= "+phone+" Salary= "+salary;
    }
    public static void main(String args[])
    {
        
    int id;
    String name,email;
    long phone;
    float salary;
    Scanner sc=new Scanner(System.in);
         int choice;
        
        ArrayList<Employee>Al=new ArrayList<Employee>();
        do{
            System.out.println("Employee Management Application");
            System.out.println("Enter 1: To Insert Employee details.");
            System.out.println("Enter 2: To Display all Employee information.");
            System.out.println("Enter 3: To Delete Employee details.");
            System.out.println("Enter 4: To Update Employee Info.");
            System.out.println("Enter 5: To Exit.");
            System.out.println("Enter choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:  System.out.println("Enter Employee details");
                         System.out.println("Enter id.");
                         id=sc.nextInt();
                         System.out.println("Enter name.");
                         name=sc.next();
                         System.out.println("Enter email.");
                         email=sc.next();
                         System.out.println("Enter Phone no.");
                         phone=sc.nextLong();
                         System.out.println("Enter Salary.");
                         salary=sc.nextFloat();
                         Employee E=new Employee(id,name,email,phone,salary);
                         Al.add(E);
                         try{
                            FileOutputStream fo=new FileOutputStream("D:\\EmployeeManagement.txt");
                            ObjectOutputStream os=new ObjectOutputStream(fo);
                            os.writeObject(Al);
                         }catch(Exception e)
                         {
                             System.out.println(e);
                         }
                         break;
                case 2: try{
                           FileInputStream fi=new FileInputStream("D:\\EmployeeManagement.txt");
                           ObjectInputStream oi=new ObjectInputStream(fi);
                           ArrayList<Employee>al=(ArrayList<Employee>)oi.readObject();
                           oi.close();
                           System.out.println(al.toString());
                          }catch(Exception e)
                          {
                              System.out.println(e);
                          }
                          break;
                case 3:System.out.println("Enter Employee id to delete details of an emp.");
                        int Id=sc.nextInt();
                       for(int i=0;i<Al.size();i++)
                       {
                          if(Id==Al.get(i).id)
                          {
                              Al.remove(i);
                          }
                       }
                        System.out.println("Information Deleted Successfully");
                        try{
                            FileOutputStream fos=new FileOutputStream("D:\\EmployeeManagement.txt");
                            ObjectOutputStream Os=new ObjectOutputStream(fos);
                            Os.writeObject(Al);
                        }catch(Exception e)
                        {
                         System.out.println(e);
                        }
                        break;
                case 4:System.out.println("Enter id to Update Information");
                       int I =sc.nextInt();
                       System.out.println("press 1: To Update name.");
                       System.out.println("press 2: To Update email.");
                       System.out.println("press 3: To Update Phone no.");
                       System.out.println("press 4: To Update Salary.");
                       System.out.println("Enter your choice");
                       int ch=sc.nextInt();
                      switch(ch){
                          case 1:System.out.println("Enter Name");
                                 String Name=sc.next();
                              for(int i=0;i<Al.size();i++)
                              {
                              if(I==Al.get(i).id)
                              {
                                  Al.get(i).name=Name;
                              }
                              } System.out.println("Information Updated Successfully");
                              break;
                          case 2:System.out.println("Enter email");
                                String Email=sc.next();
                                for(int i=0;i<Al.size();i++)
                              {
                              if(I==Al.get(i).id)
                              {
                                  Al.get(i).email=Email;
                              }
                              } System.out.println("Information Updated Successfully");
                              break;
                          case 3:System.out.println("Enter Phone no.");
                                 long Phone=sc.nextLong();
                                 for(int i=0;i<Al.size();i++)
                              {
                              if(I==Al.get(i).id)
                              {
                                  Al.get(i).phone=Phone;
                              }
                              } System.out.println("Information Updated Successfully");
                              break;
                          case 4:System.out.println("Enter Salary");
                                 float Sal=sc.nextFloat();
                                 for(int i=0;i<Al.size();i++)
                              {
                              if(I==Al.get(i).id)
                              {
                                  Al.get(i).salary=Sal;
                              }
                              } System.out.println("Information Updated Successfully");
                              break;
                          default:System.out.println("Incorrect choice.");
                                  break;
                       
                      } try{
                            FileOutputStream fos=new FileOutputStream("D:\\EmployeeManagement.txt");
                            ObjectOutputStream Os=new ObjectOutputStream(fos);
                            Os.writeObject(Al);
                        }catch(Exception e)
                        {
                         System.out.println(e);
                        }
                        break;    
                case 5:System.exit(0);
                        break;
                default:System.out.println("Enter correct choice");
                        break;
            } 
        }while(true);    
    }
}

