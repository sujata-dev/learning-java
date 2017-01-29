//Using this keyword
class This
{
    int x=5;
    public static void main(String args[])
    {
        This t1=null;
        t1=new This();
        t1=new This(20);
    }
    This()
    {
        int x=40;
        System.out.println("Instance variable: "+this.x);
        System.out.println("Local variable: "+x);
    }
    This(int x)
    {
        System.out.println("Instance variable: " +this.x);
        System.out.println("Local variable: "+x);
        this.method();
    }
    void method()
    {
        System.out.println("Hello world");
    }
}
