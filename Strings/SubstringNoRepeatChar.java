package Strings;

import java.util.HashSet;
import java.util.Set;

class SubstringNoRepeatChar {
    public static void main(String[] args) {
        String s = "abcabcdaaababcde";
        int result = longestUniqueSubstring(s);
        System.out.println("substring without repeating characters: " + result);
    }

    static int longestUniqueSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
          while (seen.contains(currentChar)) {
                seen.remove(s.charAt(start));
                start++;
            }

            seen.add(currentChar);
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
