public class FindLargestNumber {
    public static void main(String[]args)
    {
        int num= 163233323;
        int largest=0;
        while(num>0)
        {
            int n1=num%10;
            if (n1>largest)
            {
                largest=n1;
            }
            num=num/10;

        }
        System.out.println("Largest Number "+largest);



    }



}
