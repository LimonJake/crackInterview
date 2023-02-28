package com.jake.arrays.strings;

import java.util.Arrays;

public class CheckPermutation {

    /*
    *   Given two Strings, write a method to decide if one is a permutation of the other.
    *
    *   Input = "god"  "dog"
    *   Output = true
    *
    *   Input = "good"  "dog"
    *   Output = false;
    */

    public boolean solutionPermutationBruteForce(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        StringBuilder sb = new StringBuilder();
        for(char c1:s1.toCharArray())
            for(char c2:s2.toCharArray())
                if(c1 == c2)
                    sb.append(c1);
        // Time O(n^2)  Space = O(1)
        return sb.toString().equals(s1);
    }

    public boolean solutionPermutationSorting(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        return helperSortedString(s1).equals(helperSortedString(s2));
        // Time O(nlogn*mlogm) Space O(1)
    }

    private static String helperSortedString(String s){
        char[] letters = s.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

    public boolean solutionPermutationUsingArrayBit(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] letters = new int[26];

        for(char c: s1.toCharArray())
            letters[c-'a']++;

        for(char secChar: s2.toCharArray()){
            letters[secChar-'a']--;
            if(letters[secChar-'a'] < 0)
                return false;
        }
        return true;
        // Time O(n)  Space O(1)
    }

}
