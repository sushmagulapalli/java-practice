package org.example.OneHundredExamples.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringInString {

    public static void findLongestSubstring(String input) {

        char[] charArray = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        int longestSubstringLength = 0;
        String longestSubstring = "";

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];

            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                i = map.get(ch);
                map.clear();
            }

            if (map.size() > longestSubstringLength) {
                longestSubstringLength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }
        System.out.println(longestSubstringLength);
        System.out.println(longestSubstring);

    }

    public static void main(String[] args) {
        findLongestSubstring("javaconceptoftheday");
    }
}
