//Implementing interfaces and abstract methods in Java
interface Shape
{
    abstract void peri();
}
class Rectangle implements Shape
{
    private int l,b;
    public Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void peri()
    {
        System.out.println("Perimeter of rectangle: "+(2*(l+b)));
    }
}
class Circle implements Shape
{
    private float pi=3.14f,r;
    public Circle(float r)
    {
        this.r=r;
    }
    public void peri()
    {
        System.out.println("Perimeter of circle: "+(2*pi*r));
    }
}
class Triangle implements Shape
{
    private double a,b,c;
    public Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void peri()
    {
        System.out.println("Perimeter of triangle: "+(a+b+c));
    }
}
class Abstract_Methods
{
    public static void main(String args[])
    {
        Shape s1=new Rectangle(10,20);
        s1.peri();
        Shape s=new Circle(2.5f);
        s.peri();
        Shape s2=new Triangle(1.1,2.2,3.3);
        s2.peri();
    }
}
