public class SwipTwoNumbers {

    public static void main (String []args)
    {
        int a=20;
        int b=40;
        //approach 1 by using third variable
       /* int t=a;
        a=b;
        b=t;
        System.out.println(a);
        System.out.println(b);*/
    //Approach 2
       /* a=a+b;   //60
        b=a-b;   //60-40=20
        a=a-b;  //60-20=40
        System.out.println(a);
        System.out.println(b);*/

        //Approach 3
     /*   a=a*b;  //20*40=800
        b=a/b;    //800/40=20
        a=a/b;  //800/20=40
             System.out.println(a);
             System.out.println(b); */
        //Approach 4
        b=a+b-(a=b);
        System.out.println(a);
        System.out.println(b);





    }




}
