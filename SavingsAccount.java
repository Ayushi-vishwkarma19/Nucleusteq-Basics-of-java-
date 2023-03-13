/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.Date;

/**
 *
 * @author dell
 */
public class SavingsAccount extends Account{
    public void withdraw()
    {
      System.out.println("Withdraw Method.");  
    }
    public void deposit()
    {
        System.out.println("Deposit Method."); 
    }
    public void fixedDeposit()
    {
       System.out.println("fixedDeposit Method.");  
    }
    public SavingsAccount(int Account_No,int bal,String Phone,String dob,String Name,String add)
    {
       super(Account_No,bal,Phone,dob,Name,add);
    }
    public static void main(String[] args)
    {
        SavingsAccount obj=new SavingsAccount(100,100000,"9827157486","19-01-2001","Ayushi","Indore");
        obj.CloseAccount();
        obj.deposit();
        obj.fixedDeposit();
        obj.withdraw();
        
        System.out.println(obj);
    }
}
