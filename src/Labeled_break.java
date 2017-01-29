//Using labelled break
public class Labeled_break
{
    public static void main(String arg[])
    {
        a:
        {
            b:
            {
                c:
                {
                    System.out.println("Hello World");
                    if(true) break b;
                    System.out.println("Label c");
                }
                System.out.println("Label b");
            }
            System.out.println("Label a");
        }
        System.out.println("Bye");
    }
}
