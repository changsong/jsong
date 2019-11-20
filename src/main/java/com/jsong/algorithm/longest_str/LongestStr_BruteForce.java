package com.jsong.algorithm.longest_str;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 2019/1/25.
 */
public class LongestStr_BruteForce {

    /**
     Approach 1: Brute Force
     Intuition

     Check all the substring one by one to see if it has no duplicate character.

     Algorithm

     Suppose we have a function boolean allUnique(String substring) which will return true if the characters in the substring are all unique, otherwise false.
     We can iterate through all the possible substrings of the given string s and call the function allUnique. If it turns out to be true,
     then we update our answer of the maximum length of substring without duplicate characters.

     Now let's fill the missing parts:

     1. To enumerate all substrings of a given string, we enumerate the start and end indices of them.
     Suppose the start and end indices are ii and jj, respectively.
     Then we have 0 \leq i \lt j \leq n0≤i<j≤n (here end index jj is exclusive by convention).
     Thus, using two nested loops with ii from 0 to n - 1n−1 and jj from i+1i+1 to nn, we can enumerate all the substrings of s.

     2. To check if one string has duplicate characters, we can use a set.
     We iterate through all the characters in the string and put them into the set one by one. Before putting one character,
     we check if the set already contains it. If so, we return false. After the loop, we return true.
     * @param args
     */
    public static void main(String[] args){
        int ret = lengthOfLongestSubstring("abcabcbb");
        ret = lengthOfLongestSubstring("bbbbb");
        ret =lengthOfLongestSubstring("pwwkew");
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j <= n; j++){
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
