package org.programmers;

class Solution {

    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("ProgrammerS123", 11);
    }
}