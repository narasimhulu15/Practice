public class CountEvenAndOddDigits {

    public static void main(String []args)
    {
        int num=123456789;
        int evenCount=0;
        int oddCount=0;
        while(num>0)
        {
             int rev=num%10;
            if (rev%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            num=num/10;
        }

        System.out.println("Even count : "+evenCount);
        System.out.println("odd count : "+oddCount);



    }


}
