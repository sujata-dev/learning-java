//Implementing function overloading
import java.util.Scanner;
public class Func_Overload
{
    public static void main(String[] args)
    {
        Area a1=new Area();
        System.out.println("Area of circle: "+a1.ar(2.0));
        System.out.println("Area of square: "+a1.ar(4,5));
    }
}
class Area
{
    double ar(double r)
    {
        return (3.14*r*r);
    }
    int ar(int l,int b)
    {
        return (l*b);
    }
}
