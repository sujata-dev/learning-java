//Implementing inheritance
import java.util.Scanner;
class Student
{
    int mark1[]=new int[3];
    String name=new String();
    Scanner s1=new Scanner(System.in);
    void input()
    {
        System.out.print("Enter name: ");
        name=s1.next();
        System.out.print("Enter marks of 3 subjects: ");
        for(int i=0;i<3;i++)
            mark1[i]=s1.nextInt();
    }
}
public class Marks extends Student
{
    int sum=0;
    public static void main(String[] args)
    {
        Marks m1=new Marks();
        m1.input();
        m1.sum1();
        m1.print();
    }
    void sum1()
    {
        for(int i=0;i<3;i++)
            sum=sum+mark1[i];
    }
    void print()
    {
        System.out.println("Name: "+name);
        for(int i=0;i<3;i++)
            System.out.println("Marks "+(i+1)+": "+mark1[i]);
        System.out.println("Sum of Marks: "+sum);
    }
}
