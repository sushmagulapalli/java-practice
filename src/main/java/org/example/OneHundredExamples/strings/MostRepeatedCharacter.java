package org.example.OneHundredExamples.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostRepeatedCharacter {

    public static void findMostRepeatedCharacter(String input) {
        //create the map
        String stringLowerCase = input.toLowerCase();
        char[] charArray = stringLowerCase.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char c : charArray) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);

        //perform the logic on map
        Set<Character> characters = map.keySet();
        int maxCount = 0;
        char maxChar = 0;
        for(char c : characters) {
            if(map.get(c) > maxCount) {
                maxCount = map.get(c);
                maxChar = c;
            }
        }

        System.out.println("Most repeated character is : " +maxChar + " count is: "+maxCount);
    }


    public static void main(String[] args) {
        findMostRepeatedCharacter("Sushma Gulapallli");
//        findMostRepeatedCharacter("Rakesh Budugu");
    }
}
