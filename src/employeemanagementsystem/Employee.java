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
public class Employee {
    int employeeID;
    String employeeName;
    float salary;
    public void setValues(int id, String name,float sal)
    {
    employeeID=id;
    employeeName=name;
    salary=sal;}
    public void display()
    {
        System.out.println(employeeID);
        System.out.println(employeeName);
        System.out.println(salary);
    }
}
