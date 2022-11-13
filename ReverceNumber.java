public class ReverceNumber {

    public static void main (String[]args)
    {
  /*      int num=987654321;
        int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;  //0+4;40+3
            num=num/10;
        }
        System.out.println("Reverse Number: "+rev);
*/
    //Using String Buffer Class
        int num=987654321;
        //StringBuffer rev;
     /*   StringBuffer sb=new StringBuffer(String.valueOf(num));

            StringBuffer rv=sb.reverse();
            System.out.println(rv);*/

        //Approach 3 Using String Builder Class

        StringBuilder sb1= new StringBuilder();
        sb1.append(num);
        StringBuilder rev=sb1.reverse();
        System.out.println(rev);




    }


}
