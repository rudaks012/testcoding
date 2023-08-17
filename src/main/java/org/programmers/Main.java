package org.programmers;

class Solution {
    public String solution(String s) {
        return s.length() % 2 == 0 ? getMiddleEven(s) : getMiddleOdd(s);
    }

    private String getMiddleEven(String s) {
        int center = s.length() / 2;
        return s.substring(center - 1, center + 1);
    }

    private String getMiddleOdd(String s) {
        return String.valueOf(s.charAt(s.length() / 2));
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution("abcde");
        System.out.println(solution);
    }
}
