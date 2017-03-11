//Implementing variable-length arguments overloading
class Varargs
{
    static void vargs(int x)
    {
        System.out.print("x="+x);
    }
    static void vargs(int... v)
    {
        System.out.print("\nInt: Number of args: "+v.length+"\nargs: ");
        for(int x:v)
            System.out.print(x+" ");
    }
    static void vargs(boolean... v)
    {
        System.out.print("\nBoolean: Number of args: "+v.length+"\nargs: ");
        for(boolean x:v)
            System.out.print(x+" ");
    }
    static void vargs(String str,double... v)
    {
        System.out.print("\n"+str+v.length+"\nargs: ");
        for(double x:v)
            System.out.print(x+" ");
    }
    public static void main(String args[])
    {
        vargs(10);
        vargs(1,2,4,5);
        vargs(true,false,false);
        vargs("Double: Number of args:",3.4);
    }
}
