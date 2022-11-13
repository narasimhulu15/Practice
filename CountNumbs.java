public class CountNumbs
{
public static void main(String []args)
{
    int num=1233444;
    int count =0;
    while (num>0)
    {
     num=num/10;
     count++;
    }
    System.out.println("Total count of digits is : "+count);


}



}
