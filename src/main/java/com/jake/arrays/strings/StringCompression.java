package com.jake.arrays.strings;

import java.util.Stack;

public class StringCompression {
    /*
    * Implement a method to perform basic string compression using the counts of repeats characters. For example,
    * the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the
    * original string, your method should return the original string. You can assume the string has only uppercase and lowercase
    * letters(a-z).
    *
    * Input  = aabcccccaaa
    * Output = a2b1c5a3
    *
    */


    public String solution(String str){
        if(str.length() == 1) return str;
        StringBuilder sb = new StringBuilder();

        char prevChar = 0;
        int count = 0;
        for(char c : str.toCharArray()){
            if( c == prevChar )
                count++;
            else{
                if( prevChar != 0)
                    sb.append(prevChar).append(count);
                prevChar = c;
                count = 1;
            }
        }
        sb.append(prevChar).append(count);
        return sb.length() < str.length() ? sb.toString() : str;
    }

}
