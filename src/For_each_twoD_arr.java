public class For_each_twoD_arr
{
    public static void main(String args[])
    {
        int arr[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        for(int i[]:arr)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
