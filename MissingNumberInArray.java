public class MissingNumberInArray {
public static void main (String[]args)
{
    int a[]={1,2,3,4,8};
    int b[]={1,2,3,4,8,7};
    int sum1=0;
    int sum2=0;

    for(int i=0;i<a.length;i++)
    {
        sum1=sum1+a[i];
    }
    for(int i=0;i<b.length;i++)
    {
        sum2=sum2+b[i];
    }

System.out.println("Missing Number is "+(sum2-sum1));
}






}
