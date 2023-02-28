package com.jake.arrays.strings;

public class OneAway {

    /*
    * OneAway
    * Type: Strings
    *
    * There are three types of edits that can be performed on strings: insert a character, remove a character,
    * or replace a character. Given twi strings, write a function to check if they are one edit (or zero edits) away.
    *
    * Example
    * pale, ple     -> true
    * pales, pale   -> true
    * pale, bale    -> true
    * pale, blake   -> false
    */

    public boolean solution(String first, String second){
        if(Math.abs(first.length() - second.length()) > 1 || first.equals(second))
            return false;

        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int idx1 = 0;
        int idx2 = 0;
        boolean foundDiff = false;

        while ( idx2< s2.length() && idx1<s1.length() ){
            if(s1.charAt(idx1) != s2.charAt(idx2)){
                if(foundDiff) return false;
                foundDiff = true;
                if(s1.length() == s2.length())
                    idx1++;
            }else
                idx1++;
            idx2++;
        }
        return true;
    }

    public boolean anotherSolution(String first, String second){
        if (Math.abs(first.length() - second.length()) > 1 || first.equals(second))
            return false;

        if( first.length() < second.length() ){
            String temp = first;
            first = second;
            second = temp;
        }

        for(int i=0; i<second.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                if(first.length() == second.length())
                    return first.substring(i+1).equals(second.substring(i+1));
                return first.substring(i+1).equals(second.substring(i));

            }
        }
        return true;
    }

}
