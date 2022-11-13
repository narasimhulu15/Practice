public class ReverseString {

    public static void main(String[]args)
    {
        String str="ABCDEFGH";
        /*  for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
*/
        //Using Character Array
     /*   String rev="";
        char a[] =str.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
            rev=rev+a[i];
        }
System.out.print("Reverse String : "+rev);
*/


        //Using Sting Buffer Class
        StringBuffer sb =new StringBuffer(str);

        StringBuffer rev= sb.reverse();
        System.out.print(rev);












    }



}
