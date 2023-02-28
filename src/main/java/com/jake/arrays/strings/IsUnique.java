package com.jake.arrays.strings;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    /*
     * Name: IsUnique
     * Type: Strings
     *
     * Description.
     *   Implement an algorithm to determinate if a string has all unique characters. What
     *   if you can't use additional data structure?
     *
     *   My notes:
     *       Ask if exist constrains, example
     *           is it Lowercase my str?
     *           length?
     *
     *       Input: str = jason  Output: true
     *       Input: str = book   Output: false
     *
     *   Solution 1: Bruteforce (Without data structure extra)
     *       Iterate my String with 2 pointer but the Time Complexity = O(n^2)
     *
     *   Solution 2:
     *       Using a HashSet<Character>
     *       I will iterate my str but only once
     *       condition cases
     *           #1 if contains
     *           #2 if it doesn't exist add character
     *       I am using a HashSet because it is a constant using  contains() method
     *       Time Complexity = O(n)
     *
     *   Solution 3:
     *       Using Bit Vector
     * */

    public boolean solutionBruteForce(String str){
        char[] arr = str.toCharArray();
        for(int i=0; i< arr.length; i++)
            for(int j=i+1; j<arr.length; j++)
                if(arr[i] ==  arr[j])
                    return false;
        return true;
    }

    public boolean solutionUsingMap(String str){
        Set<Character> set = new HashSet<>();
        for(char character : str.toCharArray()){
            if(set.contains(character))
                return false;
            else
                set.add(character);
        }
        return true;
    }

    public boolean solutionUsingBit(String str){
        int checker = 0;
        for(char ch : str.toCharArray()){
            int val = ch - 'a';
            if((checker & (1<<val)) > 0)
                return false;
            checker |=  1<<val;
        }
        return true;
    }

}
