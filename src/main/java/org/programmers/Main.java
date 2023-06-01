package org.programmers;

class Solution {

    public String solution(String my_string, int n) {
        int length = my_string.length();
        return my_string.substring(length - n, length);
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("ProgrammerS123", 11);
    }
}