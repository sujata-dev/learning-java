//Implementing methods in String class
class StringMethods
{
    public static void main(String args[])
    {
        String str1 = "abc",str2 = "def",str3 = str1;
        System.out.println("Length of str1: " +str1.length());
        System.out.println("Char at index 2 in str1: " +str1.charAt(3));
        if(str1.equals(str2))
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");
    }
}
