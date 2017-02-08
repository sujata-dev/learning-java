//Implementing static variables, methods and blocks
public class Static
{
    static int a=3,b;
    public static void main(String args[])
    {
        func(10);
        Static1 s1=new Static1();
    }
    static
    {
        System.out.print("Static block");
        b=a*4;
    }
    static void func(int x)
    {
        System.out.print("\n\nx="+x+"\na="+a+"\nb=" + b);
    }
}
class Static1
{
    Static1()
    {
        Static.func(20);
        System.out.print("\n\na="+Static.a);
    }
}
