package org.programmers;

class Solution {
    public String solution(String myString) {
        return myString.toLowerCase();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("aBcDeFg");
    }
}