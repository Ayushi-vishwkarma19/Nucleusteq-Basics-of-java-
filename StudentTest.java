/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author dell
 */
public class StudentTest {
    public static void main(String []args)
    {
     Student S1=new Student();
     S1.setter(101, 70, 68, 75,"Ayushi", "MCA");
     S1.CalculateTotal();
     S1.CalculateAverage();
     S1.CalculateGrade();
     System.out.println(S1.toString());
     S1.setter(102, 80, 77, 67, "Arpita", "BCA");
     S1.CalculateTotal();
     S1.CalculateAverage();
     S1.CalculateGrade();
     System.out.println(S1.toString());
     S1.setter(103, 80, 86, 87, "Jiya", "MBA");
     S1.CalculateTotal();
     S1.CalculateAverage();
     S1.CalculateGrade();
     System.out.println(S1.toString());
     S1.setter(104, 70, 76, 87, "Kartik", "MCA");
     S1.CalculateTotal();
     S1.CalculateAverage();
     S1.CalculateGrade();
     System.out.println(S1.toString());
    }
}
