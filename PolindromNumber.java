public class PolindromNumber {

    public static void main(String[]args)
    {
        int num=1232;
        int original=num;
        int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);

        if (original==rev)
        {
            System.out.println("This is Polindrom number: "+rev);
        }
        else{
            System.out.println("This is not Polindrom Number "+rev);
        }



    }



}
