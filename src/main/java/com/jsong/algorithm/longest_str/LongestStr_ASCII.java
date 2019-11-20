package com.jsong.algorithm.longest_str;

/**
 *
 *
 *
 * Created by user on 2019/1/25.
 */
public class LongestStr_ASCII {

    /**
     The previous implements all have no assumption on the charset of the string s.

     If we know that the charset is rather small, we can replace the Map with an integer array as direct access table.

     Commonly used tables are:

     int[26] for Letters 'a' - 'z' or 'A' - 'Z'
     int[128] for ASCII
     int[256] for Extended ASCII
     */
    public static void main(String[] args){
        int ret = lengthOfLongestSubstring("abcabcbb");
        System.out.println(ret);
        ret = lengthOfLongestSubstring("bbbbb");
        System.out.println(ret);
        ret =lengthOfLongestSubstring("pwwkew");
        System.out.println(ret);
    }


    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
