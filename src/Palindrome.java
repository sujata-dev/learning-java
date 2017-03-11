//To check if a string is a palindrome
import java.io.*;
import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        String str,rev;
        int n,i;
        boolean b=true;
        while(b)
        {
            System.out.print("\nEnter string: ");
            str=br.readLine();
            rev="";
            n=str.length();
            for(i=n-1;i>=0;i--)
                rev=rev+str.charAt(i);
            if(str.equals(rev))
                System.out.println("It is a palindrome");
            else
                System.out.println("It is not a palindrome");
            System.out.print("\nEnter true to continue, false to exit: ");
            b=sc.nextBoolean();
        }
    }
}
