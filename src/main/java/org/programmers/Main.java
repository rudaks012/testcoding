package org.programmers;

class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.matches("^[0-9]*$");
        } else {
            return false;
        }
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean solution = s.solution("a234");
        System.out.println(solution);
    }
}
