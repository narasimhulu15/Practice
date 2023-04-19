package Practice1;

import java.util.Arrays;

public class JavaStringPrograms {


    public static void main(String[]args){


        JavaStringPrograms nara1= new JavaStringPrograms();

        nara1.stringProgram();

    }

    public void stringProgram(){
        String s1="gabdfc";
        String s2="abcdguf";
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        Boolean results =Arrays.equals(c1,c2);
        if (results==true){
            System.out.println("Strings are Anagram");
        }else {
            System.out.println("String are not Anagram");
        }
    }



}
