// Create class Employee_Detail with attributes Employee_id, Name, Designation, and Salary. Write a 
// program to read the detail from user and print it.

import java.util.Scanner;
public class Employee_demo{
    public static void main(String[] args) {
        employee_detail em=new employee_detail();
        em.readdata();
    }
}
class employee_detail{
    Scanner sc=new Scanner(System.in);
        int employee_id;
        String name;
        String designation;
        double salary;

        public void readdata(){
            System.out.println("Enter Employee id:");
            employee_id=sc.nextInt();
            System.out.println("Enter Employee Name:");
            name=sc.next();
            System.out.println("Enter Employee Designation:");
            designation=sc.next();
            System.out.println("Enter Salary:");
            salary=sc.nextDouble();

            System.out.println("Employee_id:"+employee_id);
            System.out.println("Employee Name:"+name);
            System.out.println("Employee Designation:"+designation);
            System.out.println("Employee Salary:"+salary);
        }
}