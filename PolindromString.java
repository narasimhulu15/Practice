public class PolindromString {

public static void main(String[]args)
{
    String str = "ABCBA";
    String originalString=str;
    String rev="";
    for(int i=str.length()-1;i>=0;i--)
    {
        rev=rev+str.charAt(i);
    }
    System.out.println(rev);

    if (originalString.equals(rev))
    {
        System.out.println("This is polindrom String :"+rev);
    }
    else
    {
        System.out.println("This is not Polindrom String :"+rev);
    }







}



}
