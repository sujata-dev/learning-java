//Passing variable arguments using array
class Variable_args_using_array
{
    static void vargs(int v[])
    {
        System.out.print("\nNumber of args: "+v.length+"\nargs: ");
        for(int x:v)
            System.out.print(x+" ");
    }
    public static void main(String args[])
    {
        int[] a1={10},a2={1,2,3},a3={};
        vargs(a1);
        vargs(a2);
        vargs(a3);
    }
}
