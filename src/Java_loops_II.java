import java.util.Scanner;
public class Java_loops_II
{
    public static void main(String args[])
    {
        int a,b,n,ans;
        Scanner s1=new Scanner(System.in);
        int q=s1.nextInt();
        for(int i=0;i<q;i++)
        {
            a=s1.nextInt();
            b=s1.nextInt();
            n=s1.nextInt();
            ans=a;
            while(n!=0)
            {
                ans=ans+b;
                System.out.print(""+ans+" ");
                b=b*2;
                n--;
            }
            System.out.println();
        }
    }
}
