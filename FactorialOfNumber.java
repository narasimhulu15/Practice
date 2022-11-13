public class FactorialOfNumber {

    public static void  main(String[]args)
    {
        //6!=1*2*3*4*5*6
        long n=12;
        long factorial=1;
        for(long i=1;i<=n;i++)
        {
                factorial = factorial * i;
        }

        System.out.println(n+" Factorial is "+factorial);
    }



}
