//Nested class within a for loop
class NestedClass_in_for
{
    public static void main(String args[])
    {
        Enclosing e1 = new Enclosing();
        e1.disp();
    }
}
class Enclosing
{
    int x=20;
    void disp()
    {
        for(int i=0;i<3;i++)
        {
            class Nested
            {
                void disp1()
                {
                    System.out.println("x="+x);
                }
            }
            Nested n1 = new Nested();
            n1.disp1();
        }
    }
}
