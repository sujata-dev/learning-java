import java.util.Scanner;
public class linear_search
{
    public static void main(String args[])
    {
        int arr[]= {6,8,10,5,2,7,3},index=0;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter item to be searched: ");
        int item=s1.nextInt();
        for(int i:arr)
        {
            index++;
            if(item==i)
            {
                System.out.print("Item found at position "+index);
                break;
            }
        }
    }
}
