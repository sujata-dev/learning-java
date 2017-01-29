//Using labelled continue
public class Labeled_continue
{
    public static void main(String args[])
    {
        label1:
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(j>i)
                {
                    System.out.println();
                    continue label1;
                }
                System.out.print((i*j)+" ");
            }
        }
    }
}
