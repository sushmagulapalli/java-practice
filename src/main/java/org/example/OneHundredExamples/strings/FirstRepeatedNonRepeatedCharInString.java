package org.example.OneHundredExamples.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedNonRepeatedCharInString {

    private static Map<Character, Integer> getMap(String input) {
        char[] charArray = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        //First part - prepare map with characters and respective count
        for(char ch : charArray) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static void findFirstRepeatedChar(String input) {
        //JavaConceptOfTheDay
        Map<Character, Integer> map = getMap(input);

        //{J=1, a=3, v=1, C=1, o=1, n=1, c=1, e=2, p=1, t=1, O=1, f=1, T=1, h=1, D=1, y=1}
        System.out.println(map);

        //Second part - actual logic to get the char
        Set<Character> characters = map.keySet();
        for(char ch : characters) {
            if(map.get(ch) > 1) {
                System.out.println("First repeated character is: " + ch);
                break;
            }
        }
    }

    public static void findFirstNonRepeatedChar(String input) {
        Map<Character, Integer> map = getMap(input);
        Set<Character> characters = map.keySet();
        for(char ch : characters) {
            if(map.get(ch) == 1) {
                System.out.println("First non-repeated character is: " + ch);
                break;
            }
        }

    }

    public static void main(String[] args) {
        findFirstRepeatedChar("JavaConceptOfTheDay");
        findFirstNonRepeatedChar("JavaConceptOfTheDay");
    }
}
