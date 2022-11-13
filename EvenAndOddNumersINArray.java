public class EvenAndOddNumersINArray {
    public static void main(String[]args) {

        int a[] = {1, 2, 3, 4, 5, 6, 8, 9, 12, 13};

        /*for(int value:a)
        {
            if(value%2==0){
            System.out.print(value+",");
            }
        }
        System.out.println();
        System.out.println("Odd Numbers are : ");
        for(int value1:a){
            if(value1%2!=0)
            {
                System.out.print(value1+",");
            }

            */

        for (int i = 0; i < a.length; i++)
        {
            if (a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }

        }
        System.out.println();

        for(int i=0;i<a.length;i++)
        {
            if (a[i]%2!=0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }


}








