public class twoD_arr
{
    public static void main(String args[])
    {
        int arr[][]=new int[4][],i,j,k=0;
        for(i=0;i<4;i++)
            arr[i]=new int[i+1];
        for(i=0;i<4;i++)
        {
            for(j=0;j<i+1;j++)
            {
                arr[i][j]=k++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
