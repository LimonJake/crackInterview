package com.jake.arrays.strings;

public class PalindromePermutation {
    /*
    * PalindromePermutation: Given a String, write a function to check if it is a permutation of a palindrome. A
    * palindrome is a word or phrase that is the same forward and backward. A permutation is rearrangement of
    * letters. The palindrome does not need to be limited to just dictionary word.
    *
    *   Input = "Tact Coa"
    *   Output = True (permutations: "taco cat", "atco cta", etc.)
    *
    *   tactcoa = tacocat
    *   t-2, a->2, c->2 o->1
    */

    public boolean solution(String str){
        int countOdd = 0;
        int[] table = new int[26];

        for(char c : str.toCharArray()){
            int letter = getCharacterValueHelper(c);
            if(letter != -1) {
                table[letter]++;
                if(table[letter] % 2 == 1)
                    countOdd++;
                else
                    countOdd--;
            }
        }
        return countOdd == 1;
    }

    private int getCharacterValueHelper(char c) {
        if('a' <= c && c <= 'z')
            return c -'a';
        else if('A' <= c && c <= 'Z')
            return c - 'A';
        return -1;
    }


    public boolean solution2(String str){
        str = str.toLowerCase().replaceAll(" ", "");
        int countOdd = 0;
        int[] table = new int[26];

        for(char c : str.toCharArray()){
            int letter = c -'a';
            table[letter]++;
            if(table[letter] % 2 == 1)
                countOdd++;
            else
                countOdd--;

        }
        return countOdd == 1;
    }

}
