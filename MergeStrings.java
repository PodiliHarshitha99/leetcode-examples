//leetcode examples: 
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int s1 = word1.length();
        int s2 = word2.length();

        int i = 0;

        while(i<s1 || i<s2){
            if (i<s1)
                sb.append(word1.charAt(i));
            if(i<s2)
                sb.append(word2.charAt(i));
                i++;
        }

        return sb.toString();


        
        
    }
