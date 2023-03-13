/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author dell
 */
public class LoanAccount extends Account{
    public void payEMI()
    {
       System.out.println("PayEMI Method.");  
    }
    public void topUpLoan()
    {
     System.out.println("topUpLoan Method.");    
    }
    public void repayment()
    {
        System.out.println("repayment Method."); 
    }
     public LoanAccount(int Account_No,int bal,String Phone,String dob,String Name,String add)
    {
       super(Account_No,bal,Phone,dob,Name,add);
    }
     public static void main(String[] args)
    {
        LoanAccount obj1=new LoanAccount(100,100000,"9827157486","19-01-2001","Ayushi","Indore");
        obj1.CloseAccount();
        obj1.payEMI();
        obj1.repayment();
        obj1.topUpLoan();
        
        System.out.println(obj1);
    }
}
