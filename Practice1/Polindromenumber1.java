package Practice1;

public class Polindromenumber1 {

    public static void main (String[]args)
    {
        int num=1232111;
        int rev=0;
        int Original=num;

        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;

        }
        //System.out.println(rev);
if (Original==rev)
{
    System.out.println("It is Polyindrom  "+rev);
}
else{
    System.out.println("It is not Polyindrome  "+rev);
}



    }




}
