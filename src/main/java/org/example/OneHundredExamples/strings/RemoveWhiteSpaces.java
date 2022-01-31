package org.example.OneHundredExamples.strings;

public class RemoveWhiteSpaces {

    //approach-1
    public static String removeWhiteSpace(String str) {
        System.out.println("Before removing the white spaces: " +str);
        str = str.replaceAll("\\s", "");
        System.out.println("After removing the white spaces: " +str);
        return str;
    }

    //approach-2
    public static String removeWhiteSpacesWithLoop(String str) {
        System.out.println("Input --> " + str);
        char[] charArray = str.toCharArray();
        String stringWithOutSpaces = "";

        for(char c : charArray) {
            if(c != ' ') {
                stringWithOutSpaces = stringWithOutSpaces + c;
            }
        }
        System.out.println("Output --> " + stringWithOutSpaces);
        return stringWithOutSpaces;
    }

    public static void main(String[] args) {
//        removeWhiteSpace("java   programming    language test");
        removeWhiteSpacesWithLoop("java   programming    language test");
    }
}
