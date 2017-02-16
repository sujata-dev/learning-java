//Implementing generic stack using Arraylist
import java.util.*;
public class Generalized_Stack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1="hello";
        Stack s1=new Stack();
        do
        {
            if(str1.equals("q")) continue;
            System.out.print("Enter item to be pushed, q to exit: ");
            str1=sc.next();
            s1.push(new Stack(str1));
        }while(!str1.equals("q"));
        s1.pop();
        s1.display();
        System.out.println("\nPopped item: "+s1.pop());
        System.out.println("Popped item: "+s1.pop());

    }
}
class Stack
{
    ArrayList<Stack> list=new ArrayList<Stack>();
    String str;
    Stack(){}
    Stack(String str)
    {
        this.str=str;
    }
    public void push(Stack obj)
    {
        list.add(obj);
    }
    public Stack pop()
    {
        return list.remove(list.size()-1);
    }
    public void display()
    {
        System.out.println("\nStack:");
        for(Stack s4:list)
            System.out.println(s4.toString());
    }
    public String toString()
    {
        return str+" ";
    }
}
