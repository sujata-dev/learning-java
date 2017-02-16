//Implementing a generic Employee class to inherit 2 concrete classes from it
import java.util.Scanner;
class Employee
{
    int id;
    String name;
    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println("Employee Id: "+id);
        System.out.println("Name: "+name);
    }
}
class Trainee extends Employee
{
    double salary;
    Trainee(int id,String name,double salary)
    {
        super(id,name);
        this.salary=salary;
    }
    void display()
    {
        System.out.println("\nTrainee:");
        super.display();
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee
{
    String branch;
    Manager(int id,String name,String branch)
    {
        super(id,name);
        this.branch=branch;
    }
    void display()
    {
        System.out.println("\nManager:");
        super.display();
        System.out.println("Branch: "+branch);
    }
}
public class EmpClass
{
    public static void main(String args[])
    {
        Employee e=new Trainee(101,"ABC",10000.00);
        e.display();
        Employee e1=new Manager(510,"XYZ","Sales");
        e1.display();
    }
}
