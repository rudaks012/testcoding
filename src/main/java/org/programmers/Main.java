package org.programmers;

class Solution {
    public String solution(int age) {

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        int tens = age / 10;
        int ones = age % 10;
        return String.valueOf(alphabet[tens]) + alphabet[ones];
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(23);
    }
}