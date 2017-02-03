//Returning an object
public class Return_Obj
{
    public static void main(String args[])
    {
        Inc ob1 = new Inc(10),ob2=ob1.func();
        System.out.print("ob1.a="+ob1.a+" ob2.a="+ob2.a);
    }
}
class Inc
{
    int a;
    Inc(int a)
    {
        this.a = a;
    }
    Inc func()
    {
        return (new Inc(a+10));
    }
}
