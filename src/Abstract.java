//Implementing abstract classes
import java.util.*;
public class Abstract
{
    public static void main(String args[])
    {
        Shape s;
        s=new Rectangle();
        s.getsides();
        System.out.println("Area of rectangle: "+s.getarea());
        System.out.println("Perimeter of rectangle: "+s.getperi());
        s=new RTriangle();
        s.getsides();
        System.out.println("Area of triangle: "+s.getarea());
        System.out.println("Perimeter of triangle: "+s.getperi());
    }
}
abstract class Shape
{
    Scanner sc=new Scanner(System.in);
    protected double dim1,dim2,dim3,dim4;
    public Shape()
    {
        dim1=dim2=dim3=dim4=0;
    }
    abstract void getsides();
    abstract double getarea();
    abstract double getperi();
}
class Rectangle extends Shape
{
    public Rectangle()
    {
        super();
    }
    public void getsides()
    {
        System.out.print("Enter length: ");
        dim1=sc.nextDouble();
        System.out.print("Enter breadth: ");
        dim2=sc.nextDouble();
    }
    public double getarea()
    {
        return dim1*dim2;
    }
    public double getperi()
    {
        return 2*(dim1+dim2);
    }
}
class RTriangle extends Shape
{
    public RTriangle()
    {
        super();
    }
    public void getsides()
    {
        System.out.print("\nEnter height: ");
        dim1=sc.nextDouble();
        System.out.print("Enter base: ");
        dim2=sc.nextDouble();
        System.out.print("Enter hypotenuse: ");
        dim3=sc.nextDouble();
    }
    public double getarea()
    {
        return 0.5*dim1*dim2;
    }
    public double getperi()
    {
        return (dim1+dim2+dim3);
    }
}
