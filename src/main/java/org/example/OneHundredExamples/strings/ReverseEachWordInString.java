package org.example.OneHundredExamples.strings;

public class ReverseEachWordInString {

    public static void reverseEachWord(String input) {

//        Input :  "Hello Bob How Are You"
//        Output : "olleH boB woH erA uoY"
        String[] strArray = input.split(" ");
        System.out.println("Input is: " + input);
        //["Hello", "Bob", "How", "Are", "You"]

        String output = "";
        for(String str : strArray) {
            StringBuilder sb = new StringBuilder(str);
            StringBuilder reversedWord = sb.reverse();
            output = output + reversedWord + " ";
        }

        System.out.println("Output is: " +output);
    }

    public static void main(String[] args) {
        reverseEachWord("Hello Bob How Are You");
    }




















//    public static void main(String[] args) {
//
//        String str="Java and selenium are programming languages";
//        StringBuffer sb1=new StringBuffer(str);
//        StringBuffer rev=sb1.reverse();
//        {
//            System.out.println("After Reversing a String: -->"+"   " +rev);
//        }
//
//        // Reverse each word in a string
//
//        String []words=str.split(" ");
//        String reverseword="";
//        for (String w :words)
//        {
//            StringBuilder sb=new StringBuilder(w);
//            sb.reverse();
//            reverseword=reverseword+sb.toString()+" ";
//        }
//        System.out.println("After reversing Each word in string: -->"+ " " +reverseword);
//    }

}
