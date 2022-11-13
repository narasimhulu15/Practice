public class SumOfElementsInArray {

    public static void main(String[]args)
    {
        int a[]={10,10,10,10,10,10,100};
        int sum=0;
       /* for(int i=0;i<=a.length-1;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of array = "+sum);
*/
        //enhanced for loop


        for(int value:a){
            sum=sum+value;
        }
        System.out.println("Sum of array = "+sum);






    }




}
