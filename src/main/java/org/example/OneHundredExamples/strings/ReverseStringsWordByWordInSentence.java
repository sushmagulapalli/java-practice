package org.example.OneHundredExamples.strings;

public class ReverseStringsWordByWordInSentence {

   //Input: Java Concept Of The Day
   //Output: Day The Of Concept Java

    public static void reverseWords(String input) {
        String[] stringArray = input.split(" ");
        //["Java","Concept","Of","The","Day"]

        String output = "";
        for(int i = stringArray.length - 1; i >= 0; i--) {
            String s = stringArray[i];
            output = output + s + " ";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        reverseWords("Java Concept Of The Day");
    }
}
