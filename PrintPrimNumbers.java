public class PrintPrimNumbers {

public static void main(String[]args)
{
    //print prim Numbers from 1 to 100;
   int  count=0;
    for (int i = 1; i <=100; i++)
    {
        for(int j=1;j<=100;j++)
        {
            if(i>j)
            {
              if(i%j==0)
              {
                  count++;
                  count=count;
                  if(count==2){
                      System.out.println(i);
                  }

              }

            }
        }

    }



}

}
