public class nested_switch
{
    public static void main(String args[])
    {
        int count=1,target=0;
        switch(count)
        {
            case 1: System.out.println("one");
                    switch(target)
                    {
                        case 0: System.out.println("target is zero");
                                break;
                        case 1: System.out.println("target is one");
                                break;
                    }
                    break;
            case 2: System.out.println("two");
        }
    }
}
