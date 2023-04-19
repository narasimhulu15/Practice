package Practice1;

import java.util.HashMap;
import java.util.Map;

public class JavaPractice {
    //Reverse string
    //Factorial
    //Palyndroim
    //Reverse Number

    public static void main(String arg[]) {
        JavaPractice nara = new JavaPractice();
//        nara.reverseString("Narasimhulu nara Abc");
//        System.out.println("--------");
//        nara.reverseSentence("I am narasimhulu");
//        System.out.println("--------");
//        nara.reverseNumber(234);
//        System.out.println("--------");
//        nara.palindromeString("ADCDA");
//        System.out.println("--------");
//        nara.palindromeNumber(898);
//        System.out.println("--------");
//        nara.factorial(12);

        nara.fibonacciSeries();
        System.out.println("--------");
        nara.swipeTwoNumbers11();

        System.out.println("--------");
        nara.findLargest();

        nara.characterOccurrence();
        nara.findOccurrenceOfEach();

        nara.removeTheSpaceGivenString();
        nara.removeSpecialCharacters();

    }


    public void reverseString(String enterString) {
        String str = enterString;
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public void reverseSentence(String enterSentence) {
        String str = enterSentence;
        String str1[] = str.split(" ");
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i] + " ");
        }

    }

    public void reverseNumber(int enterNumber) {
        int number = enterNumber;
        int rev = 0;
        while (number != 0) {

            rev = rev * 10 + number % 10;
            number = number / 10;

        }

        System.out.println("Reverse Number :" + rev);


    }

    //Palindrome
    public void palindromeString(String enterString) {

        String str = enterString;
        String poli = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            poli = poli + str.charAt(i);
        }

        System.out.println("---------------------------");
        if (poli.equals(str)) {
            System.out.println("This is Palindrome Number :" + poli);
        } else {
            System.out.println("This is Not Palindrome Number :" + poli);

        }

    }

    public void palindromeNumber(int enterNumber) {
        int number1 = enterNumber;
        int number = number1;
        int revNumber = 0;
        while (number > 0) {
            revNumber = revNumber * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(number1);
        if (revNumber == number1) {
            System.out.println("This is Palindrome Number:" + revNumber);
        } else {
            System.out.println("This is Not Palindrome Number:" + revNumber);
        }

    }

    public void factorial(int number) {
        //3!=1*2*3=6
        //5!=1*2*3*4*5=120
        int n = number;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is :" + factorial);


    }

    public void fibonacciSeries() {
        //0 1 1 2 3 5 8
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < 10; i++) {
            sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;
        }

    }

    public void swipeTwoNumbers11() {
        int a = 13;
        int b = 34;
        //By Using third variable
        int t = a;
        a = b;
        b = t;
        System.out.println("value of a actual is 13 , expected a value  :- " + a);
        System.out.println("value of b actual is 34 , expected a value  :- " + b);

        //Approach 2
        int a1 = 13;
        int b1 = 34;
        System.out.println("Approach 2 ");
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println("value of a1 actual is 13 , expected a1 value  :- " + a);
        System.out.println("value of b1 actual is 34 , expected a1 value  :- " + b);
    }

    public void findLargest() {

        int number = 19838376;
        int largest = 0;
        while (number > 0) {

            int number1 = number % 10;
            if (number1 > largest) {
                largest = number1;
            }
            number = number / 10;
        }
        System.out.println("Largest Number is :- " + largest);
    }


    public void characterOccurrence() {
        String str = "opentext";
        char chare = 't';
        int count = 1;
        if (str.indexOf(chare) == -1) {
            System.out.println("Given Charector not in String :-" + chare);
            System.exit(0);
        }
        for (int i = 0; i < str.length(); i++) {
            char char1 = str.charAt(i);
            if (char1 == chare) {
                str = str.replaceFirst(String.valueOf(char1), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
    }

    public void findOccurrenceOfEach() {
        String str = "narasimhulu";
        char[] char1 = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : char1) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int count = map.get(ch);
                map.put(ch, count + 1);
            }

        }
        System.out.println(map);
    }

    public void removeTheDuplicatesInString() {
        String str = "narasimhulu";
        char char1[] = str.toCharArray();
        for (char ch : char1) {
//            if(str.contains(ch)){
        }
    }

    public void removeTheSpaceGivenString() {

        String str = "Narasimhulu Bhagya Bojjamma Pullanna";
//       String str1= str.replace(" ","");
        String str1 = str.replaceAll("\\s", "");
        System.out.println(str);
        System.out.println(str1);

    }

    public void removeSpecialCharacters() {
        String str = "N#arasi@h*ulu";
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);
    }

}
