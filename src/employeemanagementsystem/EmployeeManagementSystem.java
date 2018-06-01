/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

/**
 *
 * @author macstudent
 */
public class EmployeeManagementSystem {

    
    
    public static void main(String[] args) 
    {
           Employee e1= new Employee();
                
                   /*e1.employeeId = 1;
                e1.employeename="rupinder";
                e1.salary=12220;
                
                Employee e2= new Employee();
                e2.employeeId=1;
                e2.employeeName="kaur";
                e2.salary=12220;
                e2.display();*/
               
                Employee e3 = new Employee();
                e3.employeeID = 2;
                e3.employeeName ="ravinder";
                e3.salary =12220;
                e3.display();
               
                Arithmatic arithmatic = new Arithmatic();
                System.out.println(arithmatic.sum(10,100));
                
                
     }
    
}
