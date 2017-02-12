//Nesting of classes
class NestedClass
{
    public static void main(String args[])
    {
        Enclosing e1=new Enclosing();
    }
}
class Enclosing
{
    static int x=100;
    Enclosing()
    {
        Nested1 n1 = new Nested1();
        Nested2 n2 = new Nested2();
        n1.disp();
        n2.disp();
    }
    class Nested1
    {
        void disp()
        {
            System.out.println("x="+x);
        }
    }
    static class Nested2
    {
        void disp()
        {
            Enclosing.x=10;
            System.out.println("x="+Enclosing.x);
        }
    }
}
