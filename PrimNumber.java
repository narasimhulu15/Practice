public class PrimNumber
{
    public static void main(String[]args)
    {
     int n=24;
      int count =0;
      if (n>1)
      {
          for(int i=1;i<=n;i++)
          {
              if(n%i==0)
              {
                  count++;
              }
          }
      }
      if (count==2)
      {
          System.out.println("This is prim Number :"+n);
      }
      else
      {
          System.out.println("This is not prim number "+n);
      }




    }

}
