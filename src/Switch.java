public class Switch
{
    public static void main(String args[])
    {
        char x='B';
        switch(x)
        {
            case 'A':   System.out.println("Excellent");
                        break;
            case 'B':
            case 'C':   System.out.println("Good");
            case 'D':   System.out.println("You passed");
                        break;
            case 'F':   System.out.println("Try again");
                        break;
            default:    System.out.println("Invalid");
        }
        System.out.println("Grade: "+x);
    }
}
