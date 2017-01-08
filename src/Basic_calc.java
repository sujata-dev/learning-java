import java.util.Scanner;
public class Basic_calc
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("\nEnter 2 numbers: ");
        float a=s1.nextFloat();
        float b=s1.nextFloat();
        while(true)
        {
            System.out.print("\nEnter 1 to add, 2 to subtract, 3 to multiply, 4 to divide, else exit: ");
            switch(s1.nextInt())
            {
                case 1: System.out.print("ans: "+(a+b)); break;
                case 2: System.out.print("ans: "+(a-b)); break;
                case 3: System.out.print("ans: "+(a*b)); break;
                case 4: System.out.print("ans: "+(a/b)); break;
                default: return;
            }
        }
    }
}
