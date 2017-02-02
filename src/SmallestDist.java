/*Find the position of the element in an array whose distance from its consecutive element is the smallest*/
import java.util.*;
class SmallestDist
{
    public static void main(String args[])
    {
        Dist d1=new Dist();
        d1.dist();
    }
}
class Dist
{
    int n,small,value,loc=0,arr[]=null;
    Dist()
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("\nEnter array size: ");
        n=s1.nextInt();
        arr=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=s1.nextInt();
    }
    void dist()
    {
        small=Math.abs(arr[0]-arr[1]);
        for(int i=0;i<n-1;i++)
        {
            value=Math.abs(arr[i]-arr[i+1]);
            if(value<small)
            {
                small=value;
                loc=i;
            }

        }
        System.out.print("\nSmallest distance: "+small);
        System.out.print("\nPosition: "+(loc+1));
    }
}
