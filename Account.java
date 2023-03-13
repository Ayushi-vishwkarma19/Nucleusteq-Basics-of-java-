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
public class Account {
    private int Account_No,bal;
    private String Name,add,Phone,dob;

    public int getAccount_No() {
        return Account_No;
    }

    public void setAccount_No(int Account_No) {
        this.Account_No = Account_No;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    public Account(int Account_No,int bal,String Phone,String dob,String Name,String add)
    {
        this.Account_No=Account_No;
        this.bal=bal;
        this.Phone=Phone;
        this.dob=dob;
        this.Name=Name;
        this.add=add;
    }
   public void CloseAccount()
   {
       System.out.println("Method to Close Account");
   }
   public String toString()
   {
      return "Account_No= "+Account_No+" bal= "+bal+" Phone= "+Phone+" dob= "+dob+" Name= "+Name+" add= "+add; 
   }
}
