/*
Question 205 - Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
*/

import java.util.Map;
import java.util.HashMap;

public class Q205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null || t == null) {
            return false;
        }
        
        s = s.trim();
        t = t.trim();
        
        if(s.length() != t.length()) {
            return false;
        }
        
        
        char c1 = '\0';
        char c2 = '\0';
        
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();
        
        for(int i = 0; i< t.length(); i++) {
            
            c1 = s.charAt(i);
            c2 = t.charAt(i);
            
            
            if(m1.containsKey(c1) && !m1.get(c1).equals(c2)) {
                return false;
            }
            
            if(m2.containsKey(c2) && !m2.get(c2).equals(c1)) {
                return false;
            }
            m1.put(c1, c2);
            m2.put(c2, c1);
        }
    
        return true;
    }
}
