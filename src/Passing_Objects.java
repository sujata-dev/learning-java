//Passing objects to methods
class Passing_Objects
{
    public static void main(String args[])
    {
        Num ob1=new Num(100,220),ob2=ob1,ob3=new Num(20,30);
        if(ob2.equals(ob3))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}
class Num
{
    int a,b;
    Num(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    boolean equals(Num n)
    {
        if(n.a==a && n.b==b)    return true;
        else    return false;
    }
}
