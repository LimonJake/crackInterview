package com.jake.arrays.strings;

public class URLify {
    /*
    * Write a method to replace all spaces in a string with '%20'. Yoy may assume that the string
    * has sufficient space at the end to hol the additional character, and that  you are given the "true"
    * length of the string. (Note: Of implementing in Java, please use a character array so that you can
    * perform this operation in place.)
    *
    * Input = "Mr John Smith     "
    * Output = "Mr%20John%20Smith"
    *
    */

    public String solutionEasy(String url){
        return url.trim().replaceAll(" ", "%20");
    }

}
