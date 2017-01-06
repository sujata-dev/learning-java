import java.util.Scanner;
public class area_of_box
{
    public static void main(String args[])
    {
        Box b1=new Box();
        System.out.print("Enter length and breadth: ");
        b1.input();
        System.out.print("Area of box: "+b1.area());
    }
}
class Box
{
    int l,b;
    void input()
    {
        Scanner s1=new Scanner(System.in);
        l=s1.nextInt();
        b=s1.nextInt();
        s1.close();
    }
    int area()
    {
        return (l*b);
    }
}
