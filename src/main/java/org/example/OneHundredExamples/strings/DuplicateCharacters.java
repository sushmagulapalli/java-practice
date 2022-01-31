package org.example.OneHundredExamples.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

    //JavaJ2EE
    public static void findDuplicateChar(String input) {

        char[] charArray = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        //[{J,2}, {a,2}, {v,1}, {2,1}, {E,2}]

        //add the characters from the input string to a map
        for(char c : charArray) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        //identify the repeated characters
        Set<Character> characters = map.keySet();
        //[J, a, v, 2, E]
        for(char c : characters) {
            if(map.get(c) > 1) {
                System.out.println("Duplicate character is: " + c + " with count: " + map.get(c));
            }
        }
    }

    public static void main(String[] args) {
        findDuplicateChar("JavaJ2EE");
        findDuplicateChar("Fresh Fish");
        findDuplicateChar("Better Butter");
    }











//    public static void main(String[] args)
//    {
//        duplicateCharCount("JavaJ2EE");
//
//        duplicateCharCount("Fresh Fish");
//
//        duplicateCharCount("Better Butter");
//    }
}
