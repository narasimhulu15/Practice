package Practice1;

public class PolindromString1 {

    public static void main(String[]args)
    {
        String str="ABCDCBA";
        String original=str;
        String revs="";
        for(int i=str.length()-1;i>=0;i--)
        {
            revs=revs+str.charAt(i);
        }
System.out.println(revs);
        if(original.equals(revs))
        {
            System.out.println("It is a polidrom String  "+revs);
        }
else{
    System.out.println("It is not Polindrome String  "+revs);
        }


    }





}
